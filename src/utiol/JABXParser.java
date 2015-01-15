package utiol;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JABXParser {

	public static Writer toXML(Object fromObj, Class fromClass) {
		StringWriter ret = null;
		if (null == fromObj || null == fromClass) return ret;

		try {
			ret = new StringWriter();
			JAXBContext jaxbContext = JAXBContext.newInstance(fromClass);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(fromObj, ret);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static Object fromXML(Reader xmlReader, Class toClass) {
		Object ret = null;
		if (null == xmlReader || null == toClass) return ret;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(toClass);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ret = jaxbUnmarshaller.unmarshal(xmlReader);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
