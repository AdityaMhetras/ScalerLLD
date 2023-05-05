package com.scaler.lld.design.prototype;

import java.util.HashMap;
import java.util.Map;

//Generic way
public class Registry<ENTITY, ENTITY_TYPE> {

    private Map<ENTITY_TYPE,ENTITY> registry = new HashMap<>();

    public void store(ENTITY_TYPE type, ENTITY backgroundObject) {
        registry.put(type,backgroundObject);
    }

    public ENTITY get(ENTITY_TYPE type) {
        return registry.get(type);
    }

}
