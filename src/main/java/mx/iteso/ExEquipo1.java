package mx.iteso;

import java.util.ArrayList;

/**
 * Created by Alan on 9/20/18.
 */
public class ExEquipo1 implements Subject {
    /**Var Observers.*/
    private ArrayList observers = new ArrayList<Observer>();
    /**Var estado.*/
    private ArrayList<String> estado;
    /**function addObserver.
     * @param observer .*/
    public final void addObserver(final Observer observer) {
        observers.add(observer);
    }
    /**function removeObserver.
     * @param observer .*/
    public final void removeObserver(final Observer observer) {
        observers.remove(observer);
    }
    /**function notifyObservers.*/
    public final void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(estado);
        }
    }
    /**function setEstado.
     * @param pestado .*/
    public final void setEstado(final ArrayList<String> pestado) {
        this.estado = pestado;
    }
    /**function getEstado.
     * @return estado.*/
    public final ArrayList<String> getEstado() {
        return estado;
    }
}
