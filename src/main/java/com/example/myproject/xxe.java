import javax.xml.parsers.*;

DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder db = dbf.newDocumentBuilder();

db.parse(new InputSource(new StringReader(xml)));

import javax.xml.stream.*;

XMLInputFactory xif = XMLInputFactory.newFactory();
XMLStreamReader xsr = xif.createXMLStreamReader(new StringReader(xml));
