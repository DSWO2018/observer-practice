/**
 * Paquete de trabajo para clases de subject.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.subject;

import mx.iteso.observer.Observer;

/**
 * Intefas para subject.
 */
public interface Subject {
    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    boolean registerObserver(Observer observer);

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    boolean removeObserver(Observer observer);

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    boolean notifyObservers(String massage, Observer observer);
}
