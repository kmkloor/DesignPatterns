package observer;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentTemperature;
	private String forecast;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		if(currentTemperature < temperature) {
			this.forecast = "Forecast: temperatures rising";
		}
		else if(currentTemperature == temperature) {
			this.forecast = "Forecast: no change";	
		}	
		else if(currentTemperature < temperature) {
			this.forecast = "Forecast: temperatures dropping";	
		}
		this.currentTemperature = temperature;
		display();
	}
	
	public void display() {
		System.out.println(forecast);
	}

}
