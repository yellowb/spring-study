package com.yellowb.singledatasourcejpamysql.service;

import com.yellowb.singledatasourcejpamysql.entity.Person;

import java.util.*;

public interface PersonService {

    List<Person> findAll();

    List<Person> findById(int id);

    List<Person> findByUserName(String userName);

    List<Person> findByIdAndUserName(int id, String userName);

    void save(Person person);

    void delete(int id);
}
