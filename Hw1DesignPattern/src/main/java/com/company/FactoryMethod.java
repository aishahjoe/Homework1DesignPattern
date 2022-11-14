package com.company;


public class FactoryMethod {

    public SerializeInterface createSer(String serType){
        if (serType == null || serType.isEmpty())
            return null;
        return switch (serType) {
            case "JSON" -> new JSONCreator();
            case "XML" -> new XMLCreator();
            default -> null;
        };
    }
}
