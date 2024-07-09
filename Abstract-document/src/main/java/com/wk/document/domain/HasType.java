package com.wk.document.domain;

import com.wk.document.Document;
import com.wk.document.domain.enums.Property;

import java.util.Optional;

public interface HasType extends Document {
    default Optional<String> getType(){
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
