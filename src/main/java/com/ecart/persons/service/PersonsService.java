package com.ecart.persons.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecart.persons.repository.Person;
import com.ecart.persons.repository.PersonsRepository;
import com.ecart.persons.request.PersonDTO;

@Service
public class PersonsService {
	Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	PersonsRepository repository;
	
	public PersonDTO getPerson(int id) {
		LOGGER.info("person id ::"+id);
		return PersonDTO.personObejctToPersonDTO(repository.getById(id));
	}

	public PersonDTO save(PersonDTO personDTO) {
		Person person = repository.save(PersonDTO.personDTOToPerson(personDTO));
		LOGGER.info("person ::"+person);
		return PersonDTO.personObejctToPersonDTO(person);
	}

}
