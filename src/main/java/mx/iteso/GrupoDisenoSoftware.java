package mx.iteso;

import java.util.ArrayList;
import java.util.List;

public class GrupoDisenoSoftware implements Subject {
    private final List<Observer> observerList;
    private String message;

    GrupoDisenoSoftware() {
        this.observerList = new ArrayList<Observer>();
    }

    public void registerObserver(final Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(final Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.setMessage(message);
        }
    }

    void sendMessage(String anyMessage) {
        this.message = anyMessage;
        notifyObservers();
    }
}
