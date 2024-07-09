package com.wk.document;

import com.wk.document.domain.HasModel;
import com.wk.document.domain.HasPrice;
import com.wk.document.domain.HasType;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasType {
    protected Car(Map<String, Object> properties) {
        super(properties);
    }
}
