package com.badspeller.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.badspeller.core.Person;

public class PersonService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Person parse(String json) throws JsonProcessingException {
        Person person = objectMapper.readValue(json, Person.class);
        return person;
    }

    public String convert(Person person) throws JsonProcessingException {
        return objectMapper.writeValueAsString(person);
    }

}
