package com.wk.document.domain;

import com.wk.document.Document;
import com.wk.document.domain.enums.Property;

import java.util.Optional;

public interface HasModel extends Document {
    default Optional<String> getModel(){
        return Optional.ofNullable((String)(get(Property.MODEL.toString())));
    }
}
