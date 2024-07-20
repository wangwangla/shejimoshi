package org.example;

public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        System.out.println("hello "+soldier);
    }

    @Override
    public void visit(Sergeant sergeant) {

    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you "+ commander);
    }
}
