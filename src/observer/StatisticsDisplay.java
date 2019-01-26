package observer;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private ArrayList<Float> temperatureList;
	private ArrayList<Float> humidityList;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
		temperatureList = new ArrayList<Float>();
		humidityList = new ArrayList<Float>();
		
	}
	
	public void update(float temperature, float humidity, float pressure) {
		temperatureList.add(temperature);
		humidityList.add(humidity);
		display();
	}
	
	private float min(ArrayList<Float> a) {
		float min = a.get(0);
		for(int i = 1; i < a.size(); i++) {
			if(min > a.get(i)) {
				min = a.get(i);
			}
		}
		return min;
	}
	
	private float max(ArrayList<Float> a) {
		float max = a.get(0);
		for(int i = 1; i < a.size(); i++) {
			if(max < a.get(i)) {
				max = a.get(i);
			}
		}
		return max;
	}
	
	private float avg(ArrayList<Float> a) {
		float avg = 0;
		for(int i = 0; i < a.size(); i++) {
			avg += a.get(i);
		}
		avg = avg/a.size();
		return avg;
	}
	
	public void display() {
		System.out.println("Temperature high: " + max(temperatureList)
				+ "F, low: " + min(temperatureList) + "F, average: " +
				avg(temperatureList) + "F");
		System.out.println("Humidity high: " + max(humidityList)
		+ "%, low: " + min(humidityList) + "%, average: " +
		avg(humidityList) + "%");
	}

}
