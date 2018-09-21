package observers;

import subjects.Grupo;

import java.util.ArrayList;

/**
 * clase.
 */
public class WhatsAppUser implements User {

    /**
     * Lista de mensajes.
     */
    private ArrayList<String> messages;
    /**
     * name of the user.
     */
    private String userName;

    /**
     * initializer.
     * @param name name of the user.
     */
    public WhatsAppUser(final String name) {
        userName = name;
        messages = new ArrayList<String>();
    }

    /**
     *
     * @return nombre del usuario
     */
    public final String getName() {
        return this.userName;
    }

    /**
     * @param s mensaje a enviar
     * @param g grupo a dónde se enviará
     */
    public final void sendMessage(final String s, final Grupo g) {
        g.dispatchMessage(userName + ": \n" + s);
    }

    /**
     * @param message mensaje a recibido
     */
    public final void getMessage(final String message) {
        messages.add(message);
    }

    /**
     * @return whether any messages were read.
     */
    public boolean readMessagesAndClear() {
        if (messages.isEmpty()) {
            return false;
        }
        else {
            System.out.println("Inbox de " + userName);
            while (messages.size() > 0){
                System.out.println(messages.get(0));
                messages.remove(0);
            }
            System.out.print("\n");
            return true;
        }
    }

    /**
     * @return whether any messages were read.
     */
    public final boolean readMessagesAndKeep() {
        if (messages.isEmpty()) {
            return false;
        } else {
            System.out.println("Inbox de " + userName);
            int temp = 0;
            while (temp < messages.size()) {
                System.out.println(messages.get(temp));
                temp = temp + 1;
            }
            System.out.print("\n");
            return true;
        }
    }

    /**
     * @return whether any messages were cleared.
     */
    public boolean clearMessages(){
        if (messages.isEmpty()) {
            return false;
        }
        else {
            messages.clear();
            return true;
        }
    }

    /**
     * @param g grupo de dónde se desea salir
     * @return true si se se dejó el grupo, false si no estaba en el grupo.
     */
    public final boolean leaveGroup(final Grupo g) {
        return g.removeUser(this);
    }

}
