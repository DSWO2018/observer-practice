package subjects;

import observers.User;

import java.util.ArrayList;

/**
 * Clase Grupo.
 */
public class GrupoDisenoSoftware {
    /**
     * Usuarios.
     */
    private ArrayList<User> usuarios;

    /**
     * mensaje.
     */
    private String message;



    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     */
    public void addUser(final User usuario) {
        usuarios.add(usuario);
    }

    /**
     * @param usuario usuario a sacar del grupo.
     */
    public void removeUser(final String usuario) {
        usuarios.remove(usuario);
    }

    /**
     * send messages to all users in group.
     */
    public void dispatchMessage() {
        for (User usuario : usuarios) {
            usuario.getMessage(this.message);
        }

    }
}
