package com.wk.document;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document{
    private final Map<String,Object> documentProperties;

    protected AbstractDocument(Map<String,Object> properties){
        Objects.requireNonNull(properties,"proerties map is required");
        this.documentProperties = properties;
    }

    @Override
    public Void put(String key, Object value) {
        documentProperties.put(key,value);
        return null;
    }

    @Override
    public Object get(String key) {
        return documentProperties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        Stream.of(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<String, Object>>) el)
                .findAny();
//                .flatMap(Collection::stream)
//                .map(constructor);
        return null;
    }
}

























