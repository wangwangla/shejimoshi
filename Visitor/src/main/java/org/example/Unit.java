package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Unit {
    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    /**
     * Accept visitor.
     */
    public void accept(UnitVisitor visitor) {
//        Stream<Unit> stream = Arrays.stream(children);
        for (Unit child : children) {
            child.accept(visitor);
        }
//        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
