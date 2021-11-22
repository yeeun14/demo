package com.example.demo.jackson;

import com.example.demo.domain.User;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonExample {
    public static void main(String[] args) throws InterruptedException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        try {
            Student student = mapper.readValue(new File("Example.json"), Student.class);
            System.out.println("First Name: "+student.getFirstName());
            System.out.println("Last Name: "+student.getLastName());
            System.out.println("City: "+student.getCity());
            System.out.println("Address: "+student.getAddress());
            System.out.println("Contact: "+student.getContact());
            System.out.println("Date of Birth: "+student.getDateOfBirth());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}

class Student{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String city;
    private String contact;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}
