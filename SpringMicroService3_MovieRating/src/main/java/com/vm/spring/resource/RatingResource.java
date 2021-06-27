package com.vm.spring.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.spring.model.Rating;
import com.vm.spring.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("movieid1", 1);	
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratingsBag = Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",3)				
				);
		UserRating userRating = new UserRating();
		userRating.setUserRatings(ratingsBag);
		return userRating;
		
	}

}
