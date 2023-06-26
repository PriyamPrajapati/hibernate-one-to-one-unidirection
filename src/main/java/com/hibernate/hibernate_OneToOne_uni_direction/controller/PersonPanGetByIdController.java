package com.hibernate.hibernate_OneToOne_uni_direction.controller;

import com.hibernate.hibernate_OneToOne_uni_direction.dto.Person;
import com.hibernate.hibernate_OneToOne_uni_direction.service.PersonService;

public class PersonPanGetByIdController {

	public static void main(String[] args) {
		
       PersonService personService = new PersonService();
		
		Person person=personService.getPersonPanById(101);
		
		System.out.println("person......Details......");
		
		System.out.println("personId = "+person.getPersonId());
		System.out.println("personName = "+person.getPersonName());
		System.out.println("personEmail = "+person.getPersonemail());
		
		System.out.println("Pan......Details.....");
		System.out.println("adharId = "+person.getPan().getPanId());
		System.out.println("adharAddress = "+person.getPan().getPanAddress());
		System.out.println("adharNumber = "+person.getPan().getPanNumber());

	}
}
