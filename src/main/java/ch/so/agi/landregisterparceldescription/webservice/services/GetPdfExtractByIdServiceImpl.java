package ch.so.agi.landregisterparceldescription.webservice.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.core.io.Resource;
import org.xml.sax.SAXException;

import ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract.GetExtractByIdResponse;
import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.Serializer;
import net.sf.saxon.s9api.XdmNode;
import net.sf.saxon.s9api.XsltCompiler;
import net.sf.saxon.s9api.XsltExecutable;
import net.sf.saxon.s9api.XsltTransformer;

import org.apache.fop.apps.FopFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.MimeConstants;

@Service
public class GetPdfExtractByIdServiceImpl implements GetPdfExtractByIdService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GetExtractByIdResponseTypeServiceImpl getExtractByIdResponseTypeService;

    @Override
    public File getExtract(String egrid) throws IOException, DatatypeConfigurationException, JAXBException, SaxonApiException, SAXException, TransformerException {
        Path tempDir = Files.createTempDirectory("parceldescription_extract_");

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        
        Resource xsltFileResource = resolver.getResource("classpath:xslt/parceldescription_extract_fo.xslt");
        InputStream xsltFileInputStream = xsltFileResource.getInputStream();
        File xsltFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), "parceldescription_extract_fo.xslt").toFile().getAbsolutePath());
        Files.copy(xsltFileInputStream, xsltFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        IOUtils.closeQuietly(xsltFileInputStream);
        
        Resource fopXconfFileResource = resolver.getResource("classpath:xslt/fop.xconf");
        InputStream fopXconfInputStream = fopXconfFileResource.getInputStream();
        File fopXconfFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), "fop.xconf").toFile().getAbsolutePath());
        Files.copy(fopXconfInputStream, fopXconfFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        IOUtils.closeQuietly(fopXconfInputStream);

        Resource[] fontResources = resolver.getResources("classpath:xslt/*.ttf");
        for (Resource resource : fontResources) {
            InputStream is = resource.getInputStream();
            File fontFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), resource.getFilename()).toFile().getAbsolutePath());
            Files.copy(is, fontFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            IOUtils.closeQuietly(is);
        }
        
        File xmlFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), egrid + ".xml").toFile().getAbsolutePath());
        File foFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), egrid + ".fo").toFile().getAbsolutePath());
        File pdfFile = new File(Paths.get(tempDir.toFile().getAbsolutePath(), egrid + ".pdf").toFile().getAbsolutePath());
        log.info(foFile.getAbsolutePath());

        // create FO file
        // from examples in source code
        GetExtractByIdResponse extractResponse = getExtractByIdResponseTypeService.getExtractById(egrid);
        JAXBContext jaxbContext = JAXBContext.newInstance(GetExtractByIdResponse.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(extractResponse, xmlFile); 

        Processor proc = new Processor(false);
        XsltCompiler comp = proc.newXsltCompiler();
        XsltExecutable exp = comp.compile(new StreamSource(xsltFile));
        XdmNode source = proc.newDocumentBuilder().build(new StreamSource(xmlFile));
        Serializer outFo = proc.newSerializer(foFile);
        XsltTransformer trans = exp.load();
        trans.setInitialContextNode(source);
        trans.setDestination(outFo);
        trans.transform();
            
        // create PDF
        // https://xmlgraphics.apache.org/fop/2.3/embedding.html
        FopFactory fopFactory = FopFactory.newInstance(fopXconfFile);
        OutputStream outPdf = new BufferedOutputStream(new FileOutputStream(pdfFile));        
        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, outPdf);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(); 
            Source src = new StreamSource(foFile);
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(src, res);
        } finally {
            outPdf.close();
        }
        return pdfFile;
    }
}
