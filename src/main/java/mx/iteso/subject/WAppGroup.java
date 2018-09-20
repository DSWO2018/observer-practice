package mx.iteso.subject;

import mx.iteso.observer.User;

import java.util.ArrayList;

public class WAppGroup implements Group{

    private ArrayList<User> usr;

    private String msg;

    public void addUser(final User user) {
        usr.add(user);
    }

    public void removeUser(final String user) {
        usr.remove(user);
    }

    public void sendMessage() {
        for (User user : usr ) {
            user.getMessage(this.msg);
        }
    }
}
