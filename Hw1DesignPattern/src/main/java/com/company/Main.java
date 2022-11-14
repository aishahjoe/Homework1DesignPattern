/*
Student ID: B221202902
Name: Siti Aishah
Surname: Binti Johan Iskandar
Course Name: SWE303 Design Pattern
Homework Number: 1
*/

package com.company;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
	Student1 myStudent =new Student1("2022","Furkan","Alhabib");
    FactoryMethod factoryMethod =new FactoryMethod();

    SerializeInterface JSONFormat = factoryMethod.createSer("JSON");
    JSONFormat.serializeData(myStudent);


    SerializeInterface XMLFormat = factoryMethod.createSer("XML");
    XMLFormat.serializeData(myStudent);

    }
}
