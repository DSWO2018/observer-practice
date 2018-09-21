package mx.iteso.impl;

import mx.iteso.Observer;
import mx.iteso.Subject;

import java.util.ArrayList;

public class Equipo1 implements Subject {
    private final ArrayList observers;
    String messages;

    public Equipo1() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.getMessage(messages);
        }
    }

    public void setMessage(String messages) {
        this.messages = messages;
        notifyObservers();
    }
}

