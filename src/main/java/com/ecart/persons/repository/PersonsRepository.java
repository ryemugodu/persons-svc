package com.ecart.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonsRepository extends JpaRepository<Person, Integer>{

}
