import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XXEExamples {

    private static final Logger LOGGER = LoggerFactory.getLogger(XXEExamples.class);

    public void method1(String xmlData) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        builder.parse(xmlData);
    }

    public void method2(String xmlData) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.parse(xmlData); 
            LOGGER.info("Parsing completed for method2.");
        } catch (Exception e) {
            LOGGER.error("An error occurred in method2: ", e);
        }
    }

    public void method3(String xmlData, MyHandler handler) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(xmlData, handler);
    }

    public void method4(String xmlData) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(xmlData, new MyHandler()); 
            LOGGER.info("Parsing completed for method4.");
        } catch (Exception e) {
            LOGGER.error("An error occurred in method4: ", e);
        }
    }

    public void method5(String xmlData) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xmlData));
    }

    public void method6(String xmlData) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xmlData));
            LOGGER.info("Parsing completed for method6.");
        } catch (Exception e) {
            LOGGER.error("An error occurred in method6: ", e);
        }
    }

    public void method7(String xmlData) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();
        factory.newTransformer().transform(new SAXSource(new InputSource(new StringReader(xmlData))), new StreamResult(System.out));
    }

    public void method8(String xmlData) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.newTransformer().transform(new SAXSource(new InputSource(new StringReader(xmlData))), new StreamResult(System.out)); 
            LOGGER.info("Parsing completed for method8.");
        } catch (Exception e) {
            LOGGER.error("An error occurred in method8: ", e);
        }
    }

    public void method9(String xmlData) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.unmarshal(new InputSource(new StringReader(xmlData)));
    }

    public void method10(String xmlData) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new InputSource(new StringReader(xmlData)));

            JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshaller.unmarshal(document);
            LOGGER.info("Parsing completed for method10.");
        } catch (Exception e) {
            LOGGER.error("An error occurred in method10: ", e);
        }
    }
}
