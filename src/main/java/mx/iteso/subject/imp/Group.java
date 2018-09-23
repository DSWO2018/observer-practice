/**
 * Paquete de trabajo para clases de subject.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.subject.imp;

import mx.iteso.observer.Observer;
import mx.iteso.observer.imp.User;
import mx.iteso.subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para grupos.
 */
public class Group implements Subject {
    /**
     * Variable de Group.
     */
    private ArrayList<Observer> groupList;
    /**
     * Variable de Group.
     */
    private String name;

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    @Override
    public String toString() {
        return "Group{" +
                "groupList=" + groupList +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public ArrayList<Observer> getGroupList() {
        return groupList;
    }

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public void setGroupList(ArrayList<Observer> groupList) {
        this.groupList = groupList;
    }

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public String getName() {
        return name;
    }

    /**
     * Se ve el esdatdo.
     *
     * @return estado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Se ve el esdatdo.
     *
     * @param name name.
     * @return estado.
     */
    public Group(String name) {
        setGroupList(new ArrayList());
        setName(name);
    }


    /**
     * Se ve el esdatdo.
     *
     * @param observer observer.
     * @return estado.
     */
    public boolean registerObserver(Observer observer) {
        groupList.add(observer);
        try {
            HashMap<String, ArrayList<String>> userGroups = ((User) observer).getGroups();
            String userName = ((User) observer).getName();
            userGroups.put(getName(), new ArrayList<String>());
            notifyObservers(userName + " fue agregado.", null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Se ve el esdatdo.
     *
     * @param observer observer.
     * @return estado.
     */
    public boolean removeObserver(Observer observer) {
        for (Observer observers : groupList) {
            try {
                String userName = ((User) observer).getName();
                observers.scoreUpdate(getName(), userName + " fue eliminado.");

            } catch (Exception e) {

            }

        }
        return groupList.remove(observer);
    }

    /**
     * Se ve el esdatdo.
     *
     * @param massage  message to send.
     * @param observer get the name.
     * @return estado.
     */
    public boolean notifyObservers(String massage, Observer observer) {
        boolean all = true;
        for (Observer observers : groupList) {
            try {
                String userName = ((User) observer).getName();
                observers.scoreUpdate(getName(), userName + ": " + massage);

            } catch (Exception e) {
                observers.scoreUpdate(getName(), massage);
                all = false;
            }

        }
        return all;
    }
}
