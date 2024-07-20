package org.example;

public class Soldier extends Unit{


    public Soldier(Unit... children) {
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
        return "soldier";
    }

}
