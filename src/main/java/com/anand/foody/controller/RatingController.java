package com.anand.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anand.foody.entity.Rating;
import com.anand.foody.service.RatingService;

@RestController("ratings")
public class RatingController {
	
	@Autowired
	RatingService ratingService;

	@PostMapping("/")
	public void addRating(@RequestBody Rating rating) {
		ratingService.addRating(rating);
	}
}
