package observers;

import subjects.Grupo;

/**
 * Interfaz user.
 */
public interface User {
    /**
     * @param message mensaje.
     * @param g grupo.
     */
    void sendMessage(String message, Grupo g);

    /**
     * @param message mensaje.
     */
    void getMessage(String message);

    /**
     *
     * @return name of the user
     */
    String getName();
}
