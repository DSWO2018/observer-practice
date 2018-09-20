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
     */
    void removeUser(String usuario);

    /**
     * Metodo para mandar mensajes.
     */
    void dispatchMessage();
}
