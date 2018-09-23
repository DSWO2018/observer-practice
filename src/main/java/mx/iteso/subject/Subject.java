package mx.iteso.subject;

import mx.iteso.observer.Observer;

/**
 * Created by Palaf on 20/09/2018.
 */
public interface Subject {
    boolean registerObserver(Observer observer);
    boolean removeObserver(Observer observer);
    boolean notifyObservers(String massage, Observer observer);
}