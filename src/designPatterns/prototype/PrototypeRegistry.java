package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry<T extends Prototype<T>> {
    private final Map<String, T> prototypes;

    public PrototypeRegistry() {
        this.prototypes = new HashMap<>();
    }

    public void register(String key, T prototype) {
        prototypes.put(key, prototype);
    }

    public T get(String key) {
        T prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.copy();
        }
        throw new IllegalArgumentException("Prototype not found for key: " + key);
    }
}
