package designPatterns.observer.observers;

import designPatterns.observer.Observer;
import designPatterns.observer.Publisher;

public class AverageDisplay implements Observer {
    private Float avgTemperature = 0.0f;
    private Float avgPrecipitation = 0.0f;
    private Float avgAqi = 0.0f;

    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        avgTemperature = (avgTemperature + temperature) / 2;
        avgPrecipitation = (avgPrecipitation + precipitation) / 2;
        avgAqi = (avgAqi + aqi) / 2;
        display();
    }

    public void display() {
        System.out.println("Average Display: ");
        System.out.println("Temperature: " + avgTemperature);
        System.out.println("Precipitation: " + avgPrecipitation);
        System.out.println("AQI: " + avgAqi);
        System.out.println("-------------------------");
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.registerObserver(this);
    }

    @Override
    public void unsubscribe(Publisher publisher) {
        publisher.removeObserver(this);
    }
}
