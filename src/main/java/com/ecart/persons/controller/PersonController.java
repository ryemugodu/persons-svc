package com.ecart.persons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.persons.request.PersonDTO;
import com.ecart.persons.service.PersonsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	PersonsService service;
	
	@Operation(summary = "Get a person by id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the person",
					content = {@Content(mediaType = "application/json", schema = @Schema(implementation = PersonDTO.class))}),
			@ApiResponse(responseCode = "400", description = "Invalid person id",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Person not found",
			content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error",
			content = @Content)
	})
	@GetMapping("/{id}")
	public ResponseEntity<PersonDTO> findPersonById(@Parameter(description = "id of person to be searched")
	@PathVariable int id){
		PersonDTO person = PersonDTO.builder().id(id).build();
		person = service.getPerson(id);
		return ResponseEntity.ok(person);
		
	}
	
	@Operation(summary = "Save person")
	@ApiResponses( value = {
			@ApiResponse(responseCode = "200", description = "Save person successful",
					content = {@Content(mediaType = "application/json", schema = @Schema(implementation = PersonDTO.class))}),
			@ApiResponse(responseCode = "400", description = "Invalid person data",
			content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error",
			content = @Content)
	})
	@PostMapping
	public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO){
		personDTO = service.save(personDTO);
		return ResponseEntity.ok(personDTO);
	}

}
