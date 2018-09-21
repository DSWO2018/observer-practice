package subjects;

import observers.User;

import java.util.ArrayList;

/**
 * Clase Grupo.
 */
public class WhatsAppGroup implements Grupo {
    /**
     * Usuarios.
     */
    private ArrayList<User> usuarios;

    /**
     * Initializer.
     */
    public WhatsAppGroup() {
        usuarios = new ArrayList<User>();
    }

    /**
     * @param usuario Nombre/Clave del usuario. Debe ser único.
     */
    public final void addUser(final User usuario) {
        usuarios.add(usuario);
        dispatchMessage(usuario.getName() + " has joined the group");
    }

    /**
     * @param usuario usuario a sacar del grupo.
     * @return s
     */
    public final boolean removeUser(final User usuario) {
        dispatchMessage(usuario.getName() + " has left the group");
        return usuarios.remove(usuario);
    }

    /**
     * send messages to all users in group.
     * @param message mensaje a enviar.
     */
    public final void dispatchMessage(final String message) {
        for (User usuario : usuarios) {
            usuario.getMessage(message);
        }
    }
}
