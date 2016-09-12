package com.cwa.wd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Random;

public class WeatherInterfaceImpl {
	private static Random random = new Random();

	public static int generateRandomIntegerValue(int minimum, int maximum) {
		if (minimum >= maximum) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		return random.nextInt((maximum - minimum) + 1) + minimum;
	}

	public static int generateRandomIntegerValue(int maximum) {
		return random.nextInt(maximum);
	}
	
	public static int generateRandomIntegerValue() {
		return random.nextInt();
	}
	
	public static double generateRandomDoubleValue(int minimum, int maximum,int precision) {
		if (minimum >= maximum) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		return truncate(minimum + (maximum - minimum) * random.nextDouble(),precision);
	}
	
	public static Date generateRandomDateValue(){
		return new Date(WeatherDataConstants.date + (Math.abs(random.nextLong()) % (15L * 365 * 24 * 60 * 60 * 1000)));
	}
	
	private static double truncate(double value, int places) {
	    return new BigDecimal(value)
	        .setScale(places, RoundingMode.DOWN)
	        .doubleValue();
	}

}
