package mx.iteso.impl;

import mx.iteso.Observer;
import mx.iteso.Subject;

import java.util.ArrayList;

/**Clase subject grupo diseño de sw. */
public class GrupoDisenoSoftware implements Subject {
    /**ArrayList observers. */
    private final ArrayList observers;
    /**Sting msg. */
    private String messages;

    /**Constructor. */
    public GrupoDisenoSoftware() {
        observers = new ArrayList();
    }
    /**@param observer . */
    public final void registerObserver(final Observer observer) {
        observers.add(observer);
    }
    /** @param observer . */
    public final void removeObserver(final Observer observer) {
        observers.remove(observer);
    }
    /**Método para notificar a los observadores. */
    public final void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.getMessage(messages);
        }
    }
    /**@param mssages . */
    public final void setMessage(final String mssages) {
        this.messages = mssages;
        notifyObservers();
    }
}
