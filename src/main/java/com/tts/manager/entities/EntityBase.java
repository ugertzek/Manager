/**
 * 
 */
package com.tts.manager.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @author Shabtay
 *
 */
@MappedSuperclass
public abstract class EntityBase implements java.io.Serializable{
	
	private static final long serialVersionUID = 4963872407092100953L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private int id;

	@Version
	protected Integer version;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 * @return this
	 */
	public EntityBase setId(int id) {
		this.id = id;
		return this;
	}
	/** The version. */

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

}
