# LandRegisterParcelDescription

```
xjc -b binding.xjb -extension Extract.xsd
```
Das `binding.xjb` ist nur vorhanden damit die Rootelementklasse korrekt mit `@XmlRootElement(name="xxxx")` annotiert wird. Fehlt diese Annotation meldet Spring Boot immer etwas wegen "media format" (oder so). TODO: korrekte Fehlermeldung!

```
http://localhost:8887/parcel/extract/xml/?XY=2598097,1225805 (Liegenschaft und Baurecht)
```

