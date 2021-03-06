package com.yellowb.singledatasourcemybatismysql.controller;


import com.yellowb.singledatasourcemybatismysql.entity.Person;
import com.yellowb.singledatasourcemybatismysql.service.PersonService;
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

    @Autowired private PersonService personService;

    /**
     * get all users
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAllPersons() {
        return personService.findAll();
    }

//    /**
//     * get user using paging, order by id asc.
//     * @param page
//     * @return
//     */
//    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
//    public List<Person> getPersonsByPaging(@PathVariable("page") int page) {
//        Sort sort = new Sort(Sort.Direction.ASC, "id");
//        PageRequest pageRequest = PageRequest.of(page, 4, sort);
//        return personService.findAll(pageRequest);
//    }

    /**
     * get user by specified id
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Person getPersonById(@PathVariable("id") int id) {
        return personService.findOne(id);
    }

//    /**
//     * get user by username
//     * @param userName
//     * @return
//     */
//    @RequestMapping(value = "/search/username/{userName}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public List<Person> getPersonsByUserName(@PathVariable("userName") String userName) {
//        return personService.findByUserName(userName);
//    }
//
//    /**
//     * Create a new user
//     * @param person
//     */
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public void save(Person person) {
//        personService.save(person);
//    }
//
//    /**
//     * Delete a user by id.
//     * @param id
//     */
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable("id") int id) {
//        personService.delete(id);
//    }
//
//    /**
//     * get user by username prefix
//     * @param prefix
//     * @return
//     */
//    @RequestMapping(value = "/search/username/starts/{prefix}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public List<Person> getPersonsByUserNameStartsWith(@PathVariable("prefix") String prefix) {
//        return personService.findUserByUsernameStartsBy(prefix);
//    }

}
