package com.wk.document.domain;

import com.wk.document.Document;
import com.wk.document.domain.enums.Property;

import java.util.Optional;

public interface HasPrice extends Document {
    default Optional<String> getPrice(){
        return Optional.ofNullable((String) get(Property.PRICE.toString()));
    }
}
