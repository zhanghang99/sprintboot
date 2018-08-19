package com.example.demo.controller;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Peng
 * Time: 2016/12/16 18:04
 */

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping(value = "/person")
    private List<Person> personList() {
        return personRepository.findAll();
    }
}
