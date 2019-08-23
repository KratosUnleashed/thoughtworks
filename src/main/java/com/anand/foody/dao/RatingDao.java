package com.anand.foody.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.foody.db.MockDB;
import com.anand.foody.entity.Rating;

@Service
public class RatingDao {

	@Autowired
	MockDB db;
	
	public void addRating(Rating rating) {
		db.addRating(rating);
	}
}
