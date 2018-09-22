package mx.iteso.subject;

import mx.iteso.observer.Observer;

/**
 * Created by Palaf on 20/09/2018.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String massage, Observer observer);
}