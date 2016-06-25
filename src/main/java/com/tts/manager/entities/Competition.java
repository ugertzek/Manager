/**
 * 
 */
package com.tts.manager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Funitz
 *
 */
@Entity
@Table(name = "competition")
public class Competition extends EntityBase {

	private static final long serialVersionUID = -7888777371843754566L;

}
