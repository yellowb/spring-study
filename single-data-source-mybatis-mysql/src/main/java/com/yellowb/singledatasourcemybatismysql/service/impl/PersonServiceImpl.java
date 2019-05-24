package com.yellowb.singledatasourcemybatismysql.service.impl;

import com.yellowb.singledatasourcemybatismysql.entity.Person;
import com.yellowb.singledatasourcemybatismysql.mapper.PersonMapper;
import com.yellowb.singledatasourcemybatismysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }
}
