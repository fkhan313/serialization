package org.serialization;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Car c1= new Car("Honda","Civic","Black",2022);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //write Car class properties into a JSON file
        //mapper.writeValue(new File("C:\\Users\\fkhan\\OneDrive\\Java Projects\\serialization\\test.json"),c1);

        //Write properties as String
        /*String data= mapper.writeValueAsString(c1);
        System.out.println(data);*/

        //read data from a JSON file
        Car c2= mapper.readValue(new File("C:\\Users\\fkhan\\OneDrive\\Java Projects\\serialization\\readJsonTest.json"), Car.class);
        System.out.println(c2);





    }
}