package com.anand.foody;

import java.util.Optional;
import java.util.stream.Stream;

public class Constants {

	public enum CUISINES {
		CONTINENTAL, INDIAN, ORIENTAL, ASIAN, THAI
	}

	public enum RATINGS {
		RATING_1(1), RATING_2(2), RATING_3(3), RATING_4(4), RATING_5(5);
		private int rating;
		RATINGS(int rating) {
			this.setRating(rating);
		}
		public static RATINGS getRatingFromInt(int rating) {
			Optional<RATINGS> findFirst = Stream.of(values()).filter(rate -> rate.getRating() == rating).findFirst();
			return findFirst.isPresent()? findFirst.get(): null;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
	}
}
