package com.wk.document;

import com.wk.document.domain.HasModel;
import com.wk.document.domain.enums.Property;

import java.util.HashMap;

/**
 * 适合解耦加属性
 */
public class App {

    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Property.MODEL.toString(),"model");
        hashMap.put(Property.PRICE.toString(),"23");
        hashMap.put(Property.TYPE.toString(),"type");
        Car car = new Car(hashMap);
        System.out.println(car.getModel().get());
        System.out.println(car.getPrice().get());
        System.out.println(car.getType().get());
    }
}
