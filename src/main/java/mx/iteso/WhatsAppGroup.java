package mx.iteso;

import java.util.ArrayList;

public class WhatsAppGroup implements Subject {

    private ArrayList<Observer> observers;
    private String message;

    public WhatsAppGroup(){
        observers = new ArrayList<Observer>();
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer); //observers.indexOf(observer)
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void updateMessage(String message){
        this.message = message;
        notifyObservers();
    }

    public void notifyObservers() {
        for(Observer observer : observers)
            observer.getMessage(this.message);
    }

}
