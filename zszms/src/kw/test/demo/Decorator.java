package kw.test.demo;

public abstract class Decorator extends Brid{
    Brid brid ;
    public Decorator(){

    }
    public Decorator(Brid brid){
        this.brid = brid;
    }

    public abstract int eleFly();
}
