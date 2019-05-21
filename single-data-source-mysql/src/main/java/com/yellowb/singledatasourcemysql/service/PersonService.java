package com.yellowb.singledatasourcemysql.service;

import com.yellowb.singledatasourcemysql.pojo.Person;

public interface PersonService {
    void create(int id, String userName);

    void deleteById(int id);

    Person getById(int id);
}
