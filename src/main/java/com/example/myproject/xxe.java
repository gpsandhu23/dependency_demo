import javax.xml.parsers.*;

DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder db = dbf.newDocumentBuilder();

db.parse(new InputSource(new StringReader(xml)));
