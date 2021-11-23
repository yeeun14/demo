package com.example.demo.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Java_Json {

    Java_Json(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Java_Json(){

    }
    String name;
    int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Java_Json person = new Java_Json("TaeYoung", 20);

        String personJson = objectMapper.writeValueAsString(person);

        System.out.println(personJson);
    }
}


