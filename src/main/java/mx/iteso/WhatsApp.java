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



        ((Group)diseño).registerUsers((User)palafox);
        ((Group)diseño).registerUsers((User)andrea);
        ((Group)diseño).registerUsers((User)joseLuis);
        ((Group)diseño).registerUsers((User)alan);
        ((Group)diseño).registerUsers((User)alex);
        ((Group)diseño).registerUsers((User)gabriel);
        ((Group)diseño).registerUsers((User)manuel);
        ((Group)diseño).registerUsers((User)pedro);
        ((Group)diseño).registerUsers((User)josue);
        ((Group)diseño).registerUsers((User)rene);
        ((Group)diseño).registerUsers((User)hiram);

        diseño.notifyObservers("Holaaaaa a todos!!",(User)palafox);
        diseño.notifyObservers("queeeee?", (User)joseLuis);
        diseño.notifyObservers("jiji",(User)andrea);


        ((Group)equipo1).registerUsers((User)joseLuis);
        ((Group)equipo1).registerUsers((User)alex);
        ((Group)equipo1).registerUsers((User)andrea);
        ((Group)equipo1).registerUsers((User)josue);
        ((Group)equipo1).registerUsers((User)rene);
        ((Group)equipo1).registerUsers((User)palafox);


        equipo1.notifyObservers("Holaaaaaa1:)",(User)andrea);
        equipo1.notifyObservers("Hola:)2",(User)palafox);
        equipo1.notifyObservers("Hola:)3",(User)joseLuis);
        equipo1.notifyObservers("Holaaaaaa:4)",(User)andrea);
        ((User)palafox).readMessagesAndClear("Equipo 1");
        ((User)palafox).readMessagesAndClear("Equipo 1");
        ((User)andrea).readMessagesAndClear("Diseño de Software");
        ((User)andrea).readMessagesAndClear("Equipo 1");
    }
}
