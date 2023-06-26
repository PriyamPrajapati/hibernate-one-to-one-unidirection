package com.hibernate.hibernate_OneToOne_uni_direction.controller;

import com.hibernate.hibernate_OneToOne_uni_direction.service.PersonService;

public class PersonPanDeleteController {

	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		
		personService.deletePersonAdharById(101);
		
	}
}
