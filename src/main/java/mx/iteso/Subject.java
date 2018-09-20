package mx.iteso;

public interface Subject {

    public void registerObserver();
    public void removeObserver();
    public void notifyObservers();
}
