package com.example.demo.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jacksonString {
    public static void main(String[] args){
        String json_str = "{\"name\":\"TaeYoung\", \"age\":25 , \"place\":\"Nevada\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(json_str);
            String name = node.get("name").asText();
            String place = node.get("age").asText();
            System.out.println("node"+node);
            System.out.println("name: "+name +", place: "+place);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}


