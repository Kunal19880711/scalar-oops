package designPatterns.strategy.googleMap;

import designPatterns.strategy.googleMap.PathCalculatorStrategies.*;

public class GoogleMaps {

    public void findPath(String source, String destination, TravelMode mode) {
        PathCalculatorStrategy pc = PathCalculatorStrategyFactory.getStrategy(mode);
        pc.calculatePath(source, destination, mode);
    }
}
