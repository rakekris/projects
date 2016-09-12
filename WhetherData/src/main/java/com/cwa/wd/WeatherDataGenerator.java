package com.cwa.wd;

public class WeatherDataGenerator {

	public static String getWeatherData(int entries) {
		return new StringBuilder().append(WeatherDataUtil.getLocationName(entries))
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getPositionParameters())
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getDateInISO8601Format())
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getWeatherCondition())
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getTemperature())
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getPressure())
				.append(WeatherDataConstants.pipe)
				.append(WeatherDataUtil.getRelativeHumidity())
				.append("\n")
				.toString();
	}

}
