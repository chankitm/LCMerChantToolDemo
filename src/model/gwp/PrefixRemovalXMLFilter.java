package model.gwp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

public class PrefixRemovalXMLFilter extends XMLFilterImpl {
    public PrefixRemovalXMLFilter(XMLReader xmlReader) {
        super(xmlReader);
    }
    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        int colonIndex = qName.indexOf(':');
        if(colonIndex >= 0) {
            qName = qName.substring(colonIndex + 1);
        }

        super.startElement(uri, localName, qName, attributes);
    }
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        int colonIndex = qName.indexOf(':');
        if(colonIndex >= 0) {
            qName = qName.substring(colonIndex + 1);
        }
        super.endElement(uri, localName, qName);
    }
}
