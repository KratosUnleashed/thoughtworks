package com.anand.foody.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.foody.dao.RatingDao;
import com.anand.foody.entity.Rating;

@Service
public class RatingService {
	
	@Autowired
	RatingDao dao;
	
	public void addRating(Rating review) {
		dao.addRating(review);
	}
}
