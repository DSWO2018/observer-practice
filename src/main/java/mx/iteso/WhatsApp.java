package mx.iteso;

import mx.iteso.observer.imp.User;
import mx.iteso.subject.imp.Group;

/**
 * Created by Palaf on 20/09/2018.
 */
public class WhatsApp {
    public static void main(String[] args) {
        User palafox = new User("Palafox");
        User rayon = new User("Rayon");
        User gringo = new User("Gringo");

        Group diseño = new Group("Diseño de Software");
        Group meditacion = new Group("Meditacion");



        diseño.registerUsers(palafox);
        diseño.registerUsers(rayon);
        diseño.registerUsers(gringo);

        diseño.notifyObservers("asdsdasdasd",palafox);
        diseño.notifyObservers("queeeee?", gringo);
        diseño.notifyObservers("jiji",rayon);

        meditacion.registerUsers(rayon);
        meditacion.registerUsers(palafox);
        meditacion.notifyObservers("Holaaaaaa1:)",rayon);
        meditacion.notifyObservers("Hola:)2",palafox);
        meditacion.notifyObservers("Hola:)3",palafox);
        meditacion.notifyObservers("Holaaaaaa:4)",rayon);
        palafox.readMessagesAndClear("Meditacion");
        palafox.readMessagesAndClear("Meditacion");
        rayon.readMessagesAndClear("Meditacion");

        rayon.readMessagesAndClear("Diseño de Software");
    }
}
