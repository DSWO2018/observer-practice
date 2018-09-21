package mx.iteso.observer;

import mx.iteso.observer.imp.User;

/**
 * Created by Palaf on 20/09/2018.
 */
public interface Observer {

     void scoreUpdate(String group, String massage, User user);
}