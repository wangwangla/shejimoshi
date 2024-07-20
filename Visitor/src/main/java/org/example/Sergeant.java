package org.example;

public class Sergeant extends Unit{


    public Sergeant(Unit... children) {
        super(children);
    }

    /**
     * Accept a Visitor.
     * @param visitor UnitVisitor to be accepted
     */
    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "sergeant";
    }

}
