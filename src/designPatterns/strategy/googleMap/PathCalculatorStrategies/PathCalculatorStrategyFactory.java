package designPatterns.strategy.googleMap.PathCalculatorStrategies;

import designPatterns.strategy.googleMap.TravelMode;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(TravelMode mode) {
        switch (mode) {
            case CAR:
                return new CarPathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculatorStrategy();
            case WALK:
                return new WalkPathCalculatorStrategy();
            default:
                throw new IllegalArgumentException("Unsupported travel mode: " + mode);
        }
    }
}
