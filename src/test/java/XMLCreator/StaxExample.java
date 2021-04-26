package XMLCreator;

import JSONCreator.ClientRequest;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class StaxExample {
    static final String fileName = "src/test/resources/NO_NDFL2_7708_6908_7707083893692032001_20200911_845B6A95-9FBB-4903-B354-23743C65E337.xml";
    ClientRequest cl = new ClientRequest();
    @Test
    public void test() throws XMLStreamException, IOException {
        System.out.print(cl.requestToJson());

//        writeTags();
//    }
//    XMLOutputFactory factory = XMLOutputFactory.newInstance();
//    public void writeTags() throws XMLStreamException, IOException {
//
//        XMLStreamWriter writer = factory.createXMLStreamWriter(
//                new FileWriter(fileName));
//        writer.writeStartDocument();
//       // writer.writeStartElement("TagName1");
//        writer.writeAttribute("AAA", "BBB");
//        writer.writeEndElement();
//        writer.writeEndDocument();
//        writer.flush();
//        writer.close();



//            XMLStreamWriter writer = (XMLStreamWriter) XMLInputFactory.newInstance().createXMLStreamReader(fileName, new FileInputStream(fileName));
//
//            writer.writeStartElement("books");
//
//            writer.writeAttribute("id", "10");
//            writer.writeCharacters("text data");
//            writer.writeCData("more text data");
//            writer.writeEndElement();
//
//            writer.writeEmptyElement("used & new");
//
//            writer.writeComment("Some comment");
//
//            writer.writeEndDocument();
//            writer.close();


    }
}