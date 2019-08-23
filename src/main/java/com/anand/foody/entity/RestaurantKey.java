package com.anand.foody.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anand.foody.Constants.CUISINES;

@Component
public class RestaurantKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9019365655922761140L;

	protected long id;
	protected String name;
	protected List<CUISINES> categories;
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
	public List<CUISINES> getCategories() {
		return categories;
	}
	public void setCategories(List<CUISINES> categories) {
		this.categories = categories;
	}
	public RestaurantKey(long id, String name, List<CUISINES> categories) {
		super();
		this.id = id;
		this.name = name;
		this.categories = categories;
	}
	public RestaurantKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
