package designPatterns.observer.observers;

import designPatterns.observer.Observer;
import designPatterns.observer.Publisher;

public class ForcastDisplay implements Observer {
    @Override
    public void notify(Integer temperature, Float precipitation, Integer aqi) {
        // Some logic to calculate forecast using ML pipeline
        // fetch the data from ML service
        display();
    }

    public void display() {
        System.out.println("Forecast Display: ");
        System.out.println("Forecasting weather based on ML pipeline...");
        System.out.println("Temperature, Precipitation, and AQI data will be used for forecasting.");
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
