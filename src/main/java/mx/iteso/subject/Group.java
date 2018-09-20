package mx.iteso.subject;

import mx.iteso.observer.User;

public interface Group {

    void addUser(User usr);

    void removeUser(String usr);

    void sendMessage();




}
