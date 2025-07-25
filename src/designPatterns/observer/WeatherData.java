package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher{
    private Integer temperature;
    private Float precipitation;
    private Integer aqi;
    private final List<Observer> observers = new ArrayList<>();

    public void setWeatherData(Integer temperature, Float precipitation, Integer aqi) {
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.aqi = aqi;
        System.out.println("Weather Data Updated:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Precipitation: " + precipitation + "mm");
        System.out.println("AQI: " + aqi);
        System.out.println("-------------------------");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.notify(temperature, precipitation, aqi);
        }
    }
}
