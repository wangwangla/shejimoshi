package org.example.system;

import java.util.HashMap;
import java.util.Optional;

public class DataStore<V> {
    private final HashMap<String,V> inner;

    public DataStore(){
        inner = new HashMap<>();
    }


    public Optional<V> get(String key){
        return Optional.ofNullable(inner.get(key));
    }

    public Optional<V> put(String key,V v){
        return Optional.ofNullable(inner.put(key,v));
    }
}
