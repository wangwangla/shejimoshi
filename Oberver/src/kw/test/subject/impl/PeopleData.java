package kw.test.subject.impl;

import kw.test.Observer;
import kw.test.subject.Subject;

import java.util.ArrayList;

public class PeopleData implements Subject {
    private ArrayList<Observer> observers;
    public PeopleData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void update(){

        notifyObserver();
    }
}
