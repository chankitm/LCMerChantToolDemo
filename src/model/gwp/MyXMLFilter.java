package model.gwp;


import org.xml.sax.*;
import org.xml.sax.helpers.XMLFilterImpl;

public class MyXMLFilter extends XMLFilterImpl {

//    String XML_NAMESPACE="";
    public MyXMLFilter(XMLReader xmlReader) {
        super(xmlReader);
    }
    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        int colonIndex = qName.indexOf(':');
        if(colonIndex >= 0) {
            qName = qName.substring(colonIndex + 1);
        }

//        uri = XML_NAMESPACE; //to prevent unknown XML element exception, we have to specify the namespace here
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