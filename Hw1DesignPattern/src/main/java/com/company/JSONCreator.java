package com.company;

import com.google.gson.Gson;

public class JSONCreator implements SerializeInterface {
    @Override

    public void serializeData(Student1 myStudent) {
        Gson gson = new Gson();
        String gsonString = gson.toJson(myStudent);
        System.out.println("JSON Format: " +gsonString);
        System.out.println("\n");
    }
}
