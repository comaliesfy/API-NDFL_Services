package XMLCreator;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;


public class StaxParserDemo {
    static final String fileName = "src/test/resources/NO_NDFL2_7708_6908_7707083893692032001_20200911_845B6A95-9FBB-4903-B354-23743C65E337.xml";

    public static void main(String[] args) throws XMLStreamException {
        List<String> empList = null;

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader =
                factory.createXMLStreamReader(
                        ClassLoader.getSystemResourceAsStream(fileName));

        while(reader.hasNext()){
            int event = reader.next();

            switch(event){
                case XMLStreamConstants.START_ELEMENT:
                    if ("2-НДФЛ".equals(reader.getLocalName())){

                        empList.add(reader.getAttributeValue(0));
                    }
                    if("employees".equals(reader.getLocalName())){
                        empList = new ArrayList<>();
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    switch(reader.getLocalName()){
                        case "employee":
                            empList.add(currEmp);
                            break;
                        case "firstName":
                            currEmp.firstName = tagContent;
                            break;
                        case "lastName":
                            currEmp.lastName = tagContent;
                            break;
                        case "location":
                            currEmp.location = tagContent;
                            break;
                    }
                    break;

                case XMLStreamConstants.START_DOCUMENT:
                    empList = new ArrayList<>();
                    break;
           }

        }

        //Print the employee list populated from XML
        for ( String emp : empList){
            System.out.println(emp);
        }

    }
}

