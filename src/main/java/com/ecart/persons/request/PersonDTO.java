package com.ecart.persons.request;

import com.ecart.persons.repository.Person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class PersonDTO {	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public static PersonDTO personObejctToPersonDTO(Person p) {
		PersonDTO dto = PersonDTO.builder().id(p.getId())
				.firstName(p.getFirstName())
				.lastName(p.getLastName())
				.email(p.getEmail())
				.phone(p.getPhone())
				.build();
		return dto;
	}
	
	public static Person personDTOToPerson(PersonDTO p) {
		Person person = Person.builder().id(p.getId())
				.firstName(p.getFirstName())
				.lastName(p.getLastName())
				.email(p.getEmail())
				.phone(p.getPhone())
				.build();
		return person;
	}
}
