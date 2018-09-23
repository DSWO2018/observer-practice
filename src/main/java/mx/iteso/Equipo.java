package mx.iteso;

/**
*Es una interface equipo.
 */
public interface Equipo {

/**
* @param usuario un usuario.
 */
    void addUser(Usuario usuario);
    /**
     * @param usuario un usuario.
     */
    void removeUser(String usuario);

    /**
     *@param  mensajito a un usuario.
     */
    void dispatchMessage(String mensajito);
}


