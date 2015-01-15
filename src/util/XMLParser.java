package util;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.*;
import javax.xml.parsers.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.gwp.PrefixRemovalXMLFilter;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

public class XMLParser {
	@SuppressWarnings("unchecked")
	public static <T> T toPojo(String input, Class<T> classOfT) throws IllegalStateException, JAXBException, ParserConfigurationException, SAXException, IOException {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        XMLReader xmlReader = sp.getXMLReader();
        XMLFilter xmlFilter = new PrefixRemovalXMLFilter(xmlReader);

        JAXBContext context = JAXBContext.newInstance(classOfT);
        Unmarshaller um = context.createUnmarshaller();
        UnmarshallerHandler unmarshallerHandler = um.getUnmarshallerHandler();
        xmlFilter.setContentHandler(unmarshallerHandler);

		StringReader sr = new StringReader(input);
		xmlFilter.parse(new InputSource(sr));
		return (T) unmarshallerHandler.getResult();
        
	}
}
