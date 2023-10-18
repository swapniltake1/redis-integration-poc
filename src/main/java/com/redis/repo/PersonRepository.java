package com.redis.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.redis.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
}