/**
 * 
 */
package com.tts.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tts.manager.entities.Person;

/**
 * @author Funitz
 *
 */
public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "manager" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      Person person = new Person();
	      person.setFirstName("Kulilitz");
	      person.setLastName("Little");
	      entitymanager.persist( person );
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );	 
	}

}
