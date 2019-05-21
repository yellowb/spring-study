package com.yellowb.singledatasourcemysql.controller;

import com.yellowb.singledatasourcemysql.pojo.Person;
import com.yellowb.singledatasourcemysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Person getById() {
        return personService.getById(1);
    }
}
