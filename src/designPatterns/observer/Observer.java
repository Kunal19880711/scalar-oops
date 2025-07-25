package designPatterns.observer;

public interface Observer {
    void notify(Integer temperature, Float precipitation, Integer aqi);
    void subscribe(Publisher publisher);
    void unsubscribe(Publisher publisher);
}
