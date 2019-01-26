package observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		@SuppressWarnings("unused")
		HeatIndexDisplay indexDisplay = new HeatIndexDisplay(weatherData);
		@SuppressWarnings("unused")
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		@SuppressWarnings("unused")
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
