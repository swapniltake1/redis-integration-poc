package com.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.redis.model.Person;
import com.redis.repo.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person) {
        personRepository.save(person);
    }
}