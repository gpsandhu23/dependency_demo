import javax.xml.parsers.*;

SAXParserFactory spf = SAXParserFactory.newInstance();
SAXParser saxParser = spf.newSAXParser();

XMLReader xmlReader = saxParser.getXMLReader();
xmlReader.parse(new InputSource(new StringReader(xml)));
