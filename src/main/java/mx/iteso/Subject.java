package mx.iteso;

public interface Subject {

    void notifyObservers();
    void removeObserver(Observer observer);
    void registerObserver(Observer observer);

}
