package mx.iteso;

public interface Equipo {
    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     */
    void addUser(Usuario usuario);
    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     */
    void removeUser(String usuario);

    /**
     * Metodo para mandar mensajes.
     */
    void dispatchMessage();
}


