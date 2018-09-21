package mx.iteso;
import java.util.ArrayList;

public class GrupoDisenoSoftware implements Equipo {
    /*
     *Create wuth IntelliJ IDEA.
     * User:Manuel Sánchez
     */


        ArrayList<Usuario> usuarios;


        private String message;


        public void addUser(final Usuario usuario) {
            usuarios.add(usuario);
        }


        public void removeUser(final String usuario) {
            usuarios.remove(usuario);
        }


        public void dispatchMessage() {
            for (Usuario usuario : usuarios) {
                usuario.getMessage(this.message);
            }

        }
    }
