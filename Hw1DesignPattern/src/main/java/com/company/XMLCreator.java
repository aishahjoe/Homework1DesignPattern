package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XMLCreator implements SerializeInterface {
    @Override

    public void serializeData(Student1 myStudent) throws JAXBException {
        JAXBContext jaxbContext= JAXBContext.newInstance(Student1.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();


        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();

        jaxbMarshaller.marshal(myStudent, sw);

        String xmlContent = sw.toString();

        System.out.println("XML Format: " +xmlContent );


    }
}
