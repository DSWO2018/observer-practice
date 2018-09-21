package subjects;

import observers.User;

/**
 * Interface grupo.
 */
public interface Grupo {

    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     */
    void addUser(User usuario);
    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     * @return s
     */
    boolean removeUser(User usuario);

    /**
     * Metodo para mandar mensajes.
     * @param message mensaje a enviar.
     */
    void dispatchMessage(String message);
}
