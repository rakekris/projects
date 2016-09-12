package com.cwa.wd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WeatherDataUtil {

	protected static DateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);

	protected static String getLocationName(int entries) {
		return WeatherDataConstants.location.concat(
				WeatherDataConstants.underScore).concat(
				String.valueOf(WeatherInterfaceImpl
						.generateRandomIntegerValue(entries)));
	}

	protected static String getPositionParameters() {
		return String
				.valueOf(getLatitude())
				.concat(WeatherDataConstants.comma)
				.concat(String.valueOf(getLongitude())
						.concat(WeatherDataConstants.comma)
						.concat(String.valueOf(getElevation())));
	}

	protected static double getLatitude() {
		return WeatherInterfaceImpl.generateRandomDoubleValue(
				WeatherDataConstants.minLatitude,
				WeatherDataConstants.maxLatitude, 2);
	}

	protected static double getLongitude() {
		return WeatherInterfaceImpl.generateRandomDoubleValue(
				WeatherDataConstants.minLongitude,
				WeatherDataConstants.maxLongitude, 2);
	}

	protected static int getElevation() {
		return WeatherInterfaceImpl
				.generateRandomIntegerValue(WeatherDataConstants.maxElevationOnEarth);
	}

	protected static double getTemperature() {
		return WeatherInterfaceImpl.generateRandomDoubleValue(
				WeatherDataConstants.minTemperature,
				WeatherDataConstants.maxTemperature, 1);
	}

	protected static double getPressure() {
		return WeatherInterfaceImpl.generateRandomDoubleValue(
				WeatherDataConstants.minPressure,
				WeatherDataConstants.maxPressure, 1);
	}

	protected static int getRelativeHumidity() {
		return WeatherInterfaceImpl.generateRandomIntegerValue(
				WeatherDataConstants.minHumidity,
				WeatherDataConstants.maxHumidity);
	}

	protected static String getDateInISO8601Format() {
		return getISO8601StringForDate(WeatherInterfaceImpl
				.generateRandomDateValue());
	}

	protected static String getISO8601StringForDate(Date date) {
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateFormat.format(date);
	}

	protected static String getWeatherCondition() {
		return WeatherConditions.values()[WeatherInterfaceImpl
				.generateRandomIntegerValue(WeatherConditions.values().length)]
				.name();
	}
}
