# LandRegisterParcelDescription

```
xjc -b binding.xjb -extension Extract.xsd
```
Das `binding.xjb` ist nur vorhanden damit die Rootelementklasse korrekt mit `@XmlRootElement(name="xxxx")` annotiert wird. Fehlt diese Annotation meldet Spring Boot immer etwas wegen "media format" (oder so). TODO: korrekte Fehlermeldung!

```
http://localhost:8887/parcel/extract/xml/?XY=2598097,1225805 (Liegenschaft und Baurecht)
http://localhost:8887/parcel/extract/xml/CH667432068228 (Liegenschaft)
http://localhost:8887/parcel/extract/xml/CH527335320693 (Baurecht)
CH310663327779 (viele Flurnamen)
CH493273420604 (grösstes Grundstück)

http://localhost:8887/parcel/fubar/xml/CH310663327779
```


## Karte in Auszug

## Dev environment

Lokale Dev-DB starten:
```
vagrant up
```

Erstmalig DB-Dump von Pub-DB kopieren und importieren:
```
scp bjsvwzie@geoutil.verw.rootso.org:/opt/workspace/dbdump/globals_geodb.rootso.org.dmp .
scp bjsvwzie@geoutil.verw.rootso.org:/opt/workspace/dbdump/pub_geodb.rootso.org.dmp .

vagrant ssh
cd /vagrant

sudo -u postgres psql -d pub -f globals_geodb.rootso.org.dmp
sudo -u postgres pg_restore --role=postgres --exit-on-error -d pub pub_geodb.rootso.org.dmp 
```

Benötigt man aktuelle Daten, muss jeweils ein neuer Dump restored werden.

## Eigentümerabfrage mit curl
```
http://srsofaioi18626.verw.rootso.org:41007/gbdbs/gbdbs

http://schemas.geo.admin.ch/BJ/TGBV/GBDBSSvc/2.1/GetParcelsById


ACTION="http://schemas.geo.admin.ch/BJ/TGBV/GBDBSSvc/2.1/GetParcelsById"
URL="http://srsofaioi18626.verw.rootso.org:41007/gbdbs/gbdbs"
curl -H "Content-Type: text/xml; charset=utf-8" -H "SOAPAction:$ACTION" -d@request.xml $URL > output.xml
```

