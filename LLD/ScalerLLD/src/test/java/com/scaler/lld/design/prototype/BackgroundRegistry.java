package com.scaler.lld.design.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry {

    private Map<BackgroundObjectType,BackgroundObject> registry = new HashMap<>();

    public void store(BackgroundObjectType type, BackgroundObject backgroundObject) {
        registry.put(type,backgroundObject);
    }

    public BackgroundObject get(BackgroundObjectType type) {
        return registry.get(type);
    }

}
