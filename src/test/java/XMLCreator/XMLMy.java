package XMLCreator;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.Test;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XMLMy {
    static final String fileName = "src/test/resources/NO_NDFL2_7708_6908_7707083893692032001_20200911_845B6A95-9FBB-4903-B354-23743C65E337.xml";

    @Test
    public static void main(String[] args) throws IOException, JDOMException, XMLStreamException {

        // try {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = factory.createXMLEventReader(
                new FileReader(fileName));
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(new File(fileName));

        Element rootElement = document.getRootElement();
        System.out.printf(String.valueOf(rootElement.getChild("Документ")));
        Element rootElement1 = rootElement.getChild("Подписант");
        rootElement1.getChild("2-НДФЛ");
        System.out.printf(String.valueOf(rootElement1));
        //List<Element> studentElements = rootElement.getChildren("Подписант");

        //System.out.print(studentElements);

//                while(eventReader.hasNext()) {
//                    XMLEvent event = eventReader.nextEvent();
//
//                    switch(event.getEventType()) {
//                        case XMLStreamConstants.START_ELEMENT:
//                            StartElement startElement = event.asStartElement();
//                            String qName = startElement.getName().getLocalPart();
//
//                            if (qName.equalsIgnoreCase("НДФЛ-2")) {
//                                Iterator<Attribute> attributes = startElement.getAttributes();
//                                String number = attributes.next().getValue();
//
//                                if(number.equalsIgnoreCase("4644568")) {
//                                    //get the student with roll no 393
//
//                                    for(int i = 0;i < studentElements.size();i++) {
//                                        Element studentElement = studentElements.get(i);
//
//                                        if(studentElement.getAttribute(
//                                                "НомСпр").getValue().equalsIgnoreCase("4644568")) {
//                                            studentElement.addContent(new Element("НомСпр").setText("9999"));
//                                        }
//                                    }
//                                }
//                            }
//                            break;
//                    }
//                }
//                XMLOutputter xmlOutput = new XMLOutputter();
//
//                // display xml
//                xmlOutput.setFormat(Format.getPrettyFormat());
//                xmlOutput.output(document, System.out);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (XMLStreamException e) {
//                e.printStackTrace();
//            } catch (JDOMException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
    }
}

