package mx.iteso.observer.imp;

import mx.iteso.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;

public class User implements Observer {
    HashMap<String, ArrayList<String>> groups;
    //ArrayList<String> messages;
    String name;

    public HashMap<String, ArrayList<String>> getGroups() {
        return groups;
    }

    public void setGroups(HashMap<String, ArrayList<String>> groups) {
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String userName) {
        groups = new HashMap<String, ArrayList<String>>();

        this.name = userName;
    }

    public boolean readMessagesAndClear(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages == null|| messages.isEmpty() )
            return false;
        else {
            System.out.println(group +" de "+ getName());
            for (int i = 0; i != messages.size(); ) {
                System.out.println(messages.get(0));
                messages.remove(0);
            }
            System.out.println("------------------------------------");
            return true;
        }
    }

    public boolean readMessagesAndKeep(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages.isEmpty() || messages == null)
            return false;
        else {

            for (int i = messages.size()-1; i > 0; i--) {
                System.out.println(messages.get(i));
            }
            return true;
        }
    }

    public boolean clearMessages(String group) {
        ArrayList<String> messages = groups.get(group);

        if (messages.isEmpty() || messages == null)
            return false;
        else {
            while (messages.size() > 0) {
                messages.remove(messages.size()-1);
            }
            return true;
        }
    }

    public boolean sendMessage(String message, String group){
        ArrayList groupMessage = groups.get(group);
        if (groupMessage == null){
            return false;
        }
        groupMessage.add(getName() + ": ");
        return true;
    }

    public void scoreUpdate(String group, String massage, User user) {
        ArrayList groupMessage = groups.get(group);
        if (groupMessage != null) {
            groupMessage.add(user.getName() + ": " + massage);
        }

    }
}
