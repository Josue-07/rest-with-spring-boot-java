package br.com.josue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.josue.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
