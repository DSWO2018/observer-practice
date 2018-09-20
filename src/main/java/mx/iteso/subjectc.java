package mx.iteso;

import mx.iteso.Subject;
import mx.iteso.Observer;
import java.util.ArrayList;

public class subjectc implements Subject {
    private ArrayList observers=null;
    private String message;



    public ArrayList  createobservers(){
        observers = new ArrayList();
        return observers;
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
            observer.update(this.message);
        }
    }



    public void setScore( String message){

        notifyObservers();
    }

}