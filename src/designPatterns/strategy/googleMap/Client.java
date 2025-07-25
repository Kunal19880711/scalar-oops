package designPatterns.strategy.googleMap;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        googleMaps.findPath("A", "B", TravelMode.CAR);
        googleMaps.findPath("A", "B", TravelMode.BIKE);
        googleMaps.findPath("A", "B", TravelMode.WALK);
    }
}
