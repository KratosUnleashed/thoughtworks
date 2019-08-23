package com.anand.foody.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.anand.foody.Constants.CUISINES;

@Entity
@Table(name = "Dish")
public class Dish implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2465480050540567096L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column
	private CUISINES category;
	@Column
	private String name;
	@Transient
	private byte[] image;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public CUISINES getCategory() {
		return category;
	}
	public void setCategory(CUISINES category) {
		this.category = category;
	}
	public Dish(long id, CUISINES category, String name, byte[] image) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.image = image;
	}
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
