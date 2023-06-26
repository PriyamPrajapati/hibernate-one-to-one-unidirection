package com.hibernate.hibernate_OneToOne_uni_direction.controller;

import java.util.List;

import com.hibernate.hibernate_OneToOne_uni_direction.dto.Pan;
import com.hibernate.hibernate_OneToOne_uni_direction.dto.Person;
import com.hibernate.hibernate_OneToOne_uni_direction.service.PersonService;

public class PersonPanDisplayAllController {

	public static void main(String[] args) {
		
PersonService personService = new PersonService();
		
		List<Person> persons =personService.getAllPerson();
						
		System.out.println("Person---details");
		
		System.out.println(persons);
	
	}
}
