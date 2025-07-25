package designPatterns.observer;

import designPatterns.observer.observers.AverageDisplay;
import designPatterns.observer.observers.CurrentDisplay;
import designPatterns.observer.observers.ForcastDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        AverageDisplay averageDisplay = new AverageDisplay();
        CurrentDisplay currentDisplay = new CurrentDisplay();
        ForcastDisplay forcastDisplay = new ForcastDisplay();

        currentDisplay.subscribe(weatherData);
        averageDisplay.subscribe(weatherData);
        weatherData.setWeatherData(30, 0.0f, 50);
        System.out.println();

        weatherData.setWeatherData(28, 0.5f, 55);
        System.out.println();

        weatherData.setWeatherData(25, 1.0f, 60);
        System.out.println();

        forcastDisplay.subscribe(weatherData);
        weatherData.setWeatherData(27, 0.2f, 52);
        System.out.println();

        weatherData.setWeatherData(29, 0.0f, 48);
        System.out.println();

        averageDisplay.unsubscribe(weatherData);
        weatherData.setWeatherData(31, 0.1f, 49);
        System.out.println();

        currentDisplay.unsubscribe(weatherData);
        weatherData.setWeatherData(32, 0.0f, 47);
        System.out.println();
    }
}
