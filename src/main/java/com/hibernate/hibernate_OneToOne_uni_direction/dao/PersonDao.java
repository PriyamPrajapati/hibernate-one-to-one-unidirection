package com.hibernate.hibernate_OneToOne_uni_direction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.hibernate_OneToOne_uni_direction.dto.Pan;
import com.hibernate.hibernate_OneToOne_uni_direction.dto.Person;

public class PersonDao {

	EntityManager entityManager = Persistence.createEntityManagerFactory("hibernate").createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * save method for Person and Pan
	 * 
	 */
	
	public Person savePersonPan(Person person,Pan pan) {
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		return person;
		
	}
	
	/*
	 * 
	 * getPersonPanById method
	 * 
	 */
	
	public Person getPersonPanById(int personId) {
		
		return entityManager.find(Person.class, personId);
	}
	
	/*
	 * 
	 * delete method for Person and Pan
	 * 
	 */
	
	public void deletePersonPanById(int personId) {
		
		Person person = getPersonPanById(personId);
		
		if(person!=null) {
			
			Pan pan = person.getPan();
			
			entityTransaction.begin();
			entityManager.remove(pan);
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}
	
	/*
	 * 
	 * update method for Person and Pan
	 * 
	 */
	
	public void updatePersonPan(int personId,String personName,String panAddress) {
		
		Person person=getPersonPanById(personId);
		
		if(person!=null) {
			
			Pan pan=person.getPan();
			
			person.setPersonName(personName);
			pan.setPanAddress(panAddress);
			entityTransaction.begin();
			entityManager.merge(pan);
			entityManager.merge(person);
			entityTransaction.commit();
		}
  }
	
	/*
	 * 
	 * display method for Person and Pan
	 * 
	 */
	
	 public List<Person> getAllPerson() {
		   
		   String displayQuery = "SELECT p FROM Person p";
			
			Query query = entityManager.createQuery(displayQuery);
			
		   return query.getResultList();
	   }
}
