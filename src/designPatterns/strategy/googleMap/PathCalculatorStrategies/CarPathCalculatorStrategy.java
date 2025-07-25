package designPatterns.strategy.googleMap.PathCalculatorStrategies;

import designPatterns.strategy.googleMap.TravelMode;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{

    @Override
    public void calculatePath(String source, String destination, TravelMode mode) {
        System.out.println("Finding path from " + source + " to " + destination + " using Car mode.");
    }
}
