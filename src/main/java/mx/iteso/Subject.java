package mx.iteso;
/**Interfaz Subject. */
public interface Subject {

    /**@param observer .*/
    void registerObserver(Observer observer);

    /** @param observer .*/
    void removeObserver(Observer observer);

    /****/
    void notifyObservers();
}
