package com.example.demo.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// Jackson라이브러리를 사용하여 문자열을 JSON객체로 변환

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


