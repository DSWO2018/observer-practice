package mx.iteso.subject;

import mx.iteso.observer.Observer;
import mx.iteso.observer.imp.User;

/**
 * Created by Palaf on 20/09/2018.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String massage, User user);
}