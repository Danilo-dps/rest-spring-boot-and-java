package com.danilodps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danilodps.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
