package com.yellowb.singledatasourcejpamysql.service;

import com.yellowb.singledatasourcejpamysql.entity.Person;

import org.springframework.data.domain.Pageable;
import java.util.*;

public interface PersonService {

    List<Person> findAll();

    List<Person> findAll(Pageable pageable);

    List<Person> findById(int id);

    List<Person> findByUserName(String userName);

    List<Person> findByIdAndUserName(int id, String userName);

    void save(Person person);

    void delete(int id);

    List<Person> findUserByUsernameStartsBy(String prefix);
}
