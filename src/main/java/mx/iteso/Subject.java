package mx.iteso;

/**
 * Created by Alan on 9/20/18.
 */
public interface Subject {
    /**function addObserver.
     * @param observer .*/
    void addObserver(Observer observer);
    /**function removeObserver.
     * @param observer .*/
    void removeObserver(Observer observer);
    /**function notifyObservers.*/
    void notifyObservers();
}
