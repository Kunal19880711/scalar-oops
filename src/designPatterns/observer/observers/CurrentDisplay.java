package designPatterns.observer.observers;

import designPatterns.observer.Observer;
import designPatterns.observer.Publisher;

public class CurrentDisplay implements Observer {
    private Integer temperature;
    private Float precipitation;
    private Integer aqi;

    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.aqi = aqi;
        display();
    }

    public void display() {
        System.out.println("Current Display: ");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Precipitation: " + precipitation + "mm");
        System.out.println("AQI: " + aqi);
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
