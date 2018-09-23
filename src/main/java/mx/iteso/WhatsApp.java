package mx.iteso;

import mx.iteso.observer.Observer;
import mx.iteso.observer.imp.User;
import mx.iteso.subject.Subject;
import mx.iteso.subject.imp.Group;

/**
 * Created by Palaf on 20/09/2018.
 */
public class WhatsApp {
    public static void main(String[] args) {
        Observer palafox = new User("Palafox");
        Observer joseLuis = new User("Jose");
        Observer alan = new User("Alan");
        Observer alex = new User("Alex");
        Observer gabriel = new User("Gabriel");
        Observer manuel = new User("Manuel");
        Observer pedro = new User("Pedro");
        Observer josue = new User("Josue");
        Observer rene = new User("Rene");
        Observer andrea = new User("Andrea");
        Observer hiram = new User("Hiram");


        Subject diseño = new Group("Diseño de Software");
        Subject equipo1 = new Group("Equipo 1");



        diseño.registerObserver(palafox);
        diseño.registerObserver(alan);
        diseño.registerObserver(alex);
        diseño.registerObserver(andrea);
        diseño.registerObserver(joseLuis);
        diseño.registerObserver(gabriel);
        diseño.registerObserver(manuel);
        diseño.registerObserver(pedro);
        diseño.registerObserver(josue);
        diseño.registerObserver(rene);
        diseño.registerObserver(hiram);

        diseño.notifyObservers("Holaaaaa a todos!!",(User)palafox);
        diseño.notifyObservers("queeeee?", (User)joseLuis);
        diseño.notifyObservers("jiji",(User)andrea);


       equipo1.registerObserver(joseLuis);
       equipo1.registerObserver(alex);
       equipo1.registerObserver(andrea);
       equipo1.registerObserver(josue);
       equipo1.registerObserver(rene);
       equipo1.registerObserver(palafox);


        equipo1.notifyObservers("Holaaaaaa1:)",(User)andrea);
        equipo1.notifyObservers("Hola:)2",(User)palafox);
        equipo1.notifyObservers("Hola:)3",(User)joseLuis);
        equipo1.notifyObservers("Holaaaaaa:4)",(User)andrea);

        ((User)palafox).readMessagesAndClear(((Group)equipo1).getName());

        ((User)palafox).readMessagesAndClear(((Group)equipo1).getName());

        ((User)andrea).readMessagesAndClear(((Group)diseño).getName());


        ((User)andrea).readMessagesAndClear(((Group)equipo1).getName());

    }
}
