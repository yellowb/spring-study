package com.yellowb.singledatasourcemysql.service.impl;

import com.yellowb.singledatasourcemysql.pojo.Person;
import com.yellowb.singledatasourcemysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired private JdbcTemplate jdbcTemplate;

    @Override
    public void create(int id, String userName) {
        jdbcTemplate.update("insert into userinfo(id, username) values(?, ?)", id, userName);
    }

    @Override
    public void deleteById(int id) {
        jdbcTemplate.update("delete from userinfo where id = ?", id);
    }

    @Override
    public Person getById(int id) {
        try {
            Person person = jdbcTemplate.queryForObject("select id, username from userinfo where id = ?", new Object[] {Integer.valueOf(id)},
                new BeanPropertyRowMapper<>(Person.class));
            return person;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
