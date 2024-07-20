package org.example;

public class CommanderVisitor implements UnitVisitor{
    @Override
    public void visit(Soldier soldier) {

    }

    @Override
    public void visit(Sergeant sergeant) {

    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you "+ commander);
    }
}
