package com.yellowb.singledatasourcejpamysql.service.impl;

import com.yellowb.singledatasourcejpamysql.entity.Person;
import com.yellowb.singledatasourcejpamysql.repository.PersonRepository;
import com.yellowb.singledatasourcejpamysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;

import java.util.*;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable).getContent();
    }

    @Override
    public List<Person> findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findByUserName(String userName) {
        return personRepository.findByUserName(userName);
    }

    @Override
    public List<Person> findByIdAndUserName(int id, String userName) {
        return personRepository.findByIdAndUserName(id, userName);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> findUserByUsernameStartsBy(String prefix) {
        return personRepository.findUserByUsernameStartsBy(prefix);
    }

}
