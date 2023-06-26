package com.hibernate.hibernate_OneToOne_uni_direction.service;

import java.util.List;

import com.hibernate.hibernate_OneToOne_uni_direction.dao.PersonDao;
import com.hibernate.hibernate_OneToOne_uni_direction.dto.Pan;
import com.hibernate.hibernate_OneToOne_uni_direction.dto.Person;

public class PersonService {

	PersonDao personDao = new PersonDao();
	
	/*
	 * save method for Person and Pan
	 * 
	 */
	
	public Person savePersonPan(Person person,Pan pan) {
		
		person.setPan(pan);
		
		return personDao.savePersonPan(person, pan);
		
	}
	
	/*
	 * 
	 * getPersonPanById method
	 * 
	 */
	
	public Person getPersonPanById(int personId) {
		
		Person person = personDao.getPersonPanById(personId);
		return person;

	}
	
	/*
	 * 
	 * delete method for Person and Pan
	 * 
	 */
	
	public void deletePersonAdharById(int personId)  {

		if (personDao.getPersonPanById(personId) != null) {
			
			personDao.deletePersonPanById(personId);
			
		}
    }
	
	/*
	 * 
	 * update method for Person and Pan
	 * 
	 */
	
	public void updatePersonAdharDetails(int personId,String personName,String adharAddress){
		
		if (personDao.getPersonPanById(personId) != null) {

			personDao.updatePersonPan(personId, personName, adharAddress);
		} 
   } 
	
	/*
	 * 
	 * display method for Person and Pan
	 * 
	 */
	
	 public List<Person> getAllPerson(){
			
			return personDao.getAllPerson();
		}
}
