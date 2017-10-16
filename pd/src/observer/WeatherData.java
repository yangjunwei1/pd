package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	private int low;
	private int heigh;
	private String weather;
	private List<Observer> observerList = new ArrayList<Observer>();
	
	public void setData(int low,int heigh,String weather) {
		this.low = low;
		this.heigh = heigh;
		this.weather = weather;
		notifyObserver();
	}
	
	
	
	public int getLow() {
		return low;
	}
	public int getHeigh() {
		return heigh;
	}
	public String getWeather() {
		return weather;
	}

	@Override
	public void registerObserver(Observer observer) {
		if(!observerList.contains(observer)) {
			observerList.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observerList.contains(observer)) {
			observerList.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observerList) {
			o.update(getLow(), getHeigh(), getWeather());
		}
	}

	
	
}
