package com.yellowb.singledatasourcejpamysql.controller;

import com.yellowb.singledatasourcejpamysql.entity.Person;
import com.yellowb.singledatasourcejpamysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAllPersons() {
        return personService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getPersonById(@PathVariable("id") int id) {
        return personService.findById(id);
    }

    @RequestMapping(value = "/search/username/{userName}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getPersonsByUserName(@PathVariable("userName") String userName) {
        return personService.findByUserName(userName);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void save(Person person) {
        personService.save(person);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
        personService.delete(id);
    }

}
