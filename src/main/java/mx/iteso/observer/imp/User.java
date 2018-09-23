/**
 * Paquete de trabajo para clases de observer.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.observer.imp;


import mx.iteso.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;

public class User implements Observer {
    /**
     * Variable para observer.
     */
    private HashMap<String, ArrayList<String>> groups;
    /**
     * Variable para observer.
     */
    private String name;

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public HashMap<String, ArrayList<String>> getGroups() {
        return groups;
    }

    /**
     * Se ve el esdatdo.
     *
     * @param groupsv grupos.
     * @return estado.
     */
    public void setGroups(HashMap<String, ArrayList<String>> groupsv) {
        this.groups = groupsv;
    }

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Se ve el esdatdo.
     *
     * @param namev name.
     * @return estado.
     */
    public void setName(String namev) {
        this.name = namev;
    }

    /**
     * Se ve el esdatdo.
     *
     * @param userName name;
     */
    public User(String userName) {
        setGroups(new HashMap<String, ArrayList<String>>());
        setName(userName);
    }

    /**
     * Se ve el esdatdo.
     *
     * @param group grupos.
     * @return estado.
     */
    public boolean readMessagesAndClear(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages == null || messages.isEmpty())
            return false;
        else {
            System.out.println(group + " de " + getName());
            for (int i = 0; i != messages.size(); ) {
                System.out.println(messages.get(0));
                messages.remove(0);
            }
            System.out.println("------------------------------------");
            return true;
        }
    }

    /**
     * Se ve el esdatdo.
     *
     * @param group grupo.
     * @return estado.
     */
    public boolean readMessagesAndKeep(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages.isEmpty() || messages == null)
            return false;
        else {

            for (int i = messages.size() - 1; i > 0; i--) {
                System.out.println(messages.get(i));
            }
            return true;
        }
    }

    /**
     * Se ve el esdatdo.
     *
     * @param group grupos.
     * @return estado.
     */
    public boolean clearMessages(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages.isEmpty() || messages == null)
            return false;
        else {
            while (messages.size() > 0) {
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

    /**
     * Se ve el esdatdo.
     *
     * @param group   group.
     * @param massage massage.
     * @return estado.
     */
    public boolean scoreUpdate(String group, String massage) {
        ArrayList groupMessage = groups.get(group);
        if (groupMessage != null) {
            groupMessage.add(massage);
            return true;

        }
        return false;
    }
}
