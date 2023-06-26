package com.hibernate.hibernate_OneToOne_uni_direction.controller;

import com.hibernate.hibernate_OneToOne_uni_direction.dto.Pan;
import com.hibernate.hibernate_OneToOne_uni_direction.dto.Person;
import com.hibernate.hibernate_OneToOne_uni_direction.service.PersonService;

public class PersonPanInsertController {

	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		
		Person person = new Person();
		
		person.setPersonId(101);
		person.setPersonName("priyam");
		person.setPersonemail("priyam@gmail.com");
		person.setPersonPhone(123456789);
		
		Pan pan = new Pan();
		pan.setPanId(102);
		pan.setPanAddress("Noida");
		pan.setPanNumber("987654321");
		
		personService.savePersonPan(person, pan);
	}
}
