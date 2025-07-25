package designPatterns.strategy.googleMap.PathCalculatorStrategies;

import designPatterns.strategy.googleMap.TravelMode;

public interface PathCalculatorStrategy {
    void calculatePath(String source, String destination, TravelMode mode);
}
