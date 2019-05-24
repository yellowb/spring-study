package com.yellowb.singledatasourcemybatismysql.service;

import com.yellowb.singledatasourcemybatismysql.entity.Person;

import java.util.*;

public interface PersonService {

    List<Person> findAll();
}
