package com.yellowb.singledatasourcejpamysql.repository;

import com.yellowb.singledatasourcejpamysql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findById(int id);

    List<Person> findByUserName(String userName);

    List<Person> findByIdAndUserName(int id, String userName);
}
