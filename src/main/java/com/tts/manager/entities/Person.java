/**
 * 
 */
package com.tts.manager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Funitz
 *
 */
@Entity
@Table(name = "person")
public class Person extends EntityBase {

	private static final long serialVersionUID = -6952968596609849379L;
	
	@Column(nullable = false)
	private String lastName ;
	
	@Column(nullable = false)
	private String firstName;

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
