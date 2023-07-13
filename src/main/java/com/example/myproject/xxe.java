import javax.xml.parsers.*;

DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
DocumentBuilder db = dbf.newDocumentBuilder();

InputSource inputSource = new InputSource(new StringReader(xml));
db.parse(inputSource);
