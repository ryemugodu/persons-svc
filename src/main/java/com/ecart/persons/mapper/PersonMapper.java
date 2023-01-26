package com.ecart.persons.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ecart.persons.repository.Person;
import com.ecart.persons.request.PersonDTO;

@Mapper
public interface PersonMapper {
	
	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
	
	PersonDTO getPersonDTO(Person person);
	
	Person getPersonFromDTO(PersonDTO dto);

}
