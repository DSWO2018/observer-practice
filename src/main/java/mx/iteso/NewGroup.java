package mx.iteso;

import mx.iteso.impl.Equipo1;
import mx.iteso.impl.GrupoDisenoSoftware;
import mx.iteso.impl.memberObserver;

public class NewGroup {
    public static void main( String[] args){
        GrupoDisenoSoftware gds;
        gds = new GrupoDisenoSoftware();

        Equipo1 equipo1;
        equipo1 = new Equipo1();

        Observer andrea = new memberObserver();
        Observer pala = new memberObserver();
        Observer joseLuis = new memberObserver();
        Observer alan = new memberObserver();
        Observer alex = new memberObserver();
        Observer gabriel = new memberObserver();
        Observer hiram = new memberObserver();
        Observer manuel = new memberObserver();
        Observer pedro = new memberObserver();
        Observer josue = new memberObserver();
        Observer rene = new memberObserver();

        System.out.println("GRUPO DISEÑO DE SOFTWARE");
        gds.registerObserver(andrea);
        gds.setMessage("Andrea ha entrado al grupo");
        gds.registerObserver(pala);
        gds.setMessage("Pala ha entrado al grupo");
        gds.registerObserver(joseLuis);
        gds.setMessage("Jose Luis ha entrado al grupo");
        gds.registerObserver(alan);
        gds.setMessage("Alan ha entrado al grupo");
        gds.registerObserver(gabriel);
        gds.setMessage("Gabriel ha entrado al grupo");
        gds.registerObserver(alex);
        gds.setMessage("Alex ha entrado al grupo");
        gds.registerObserver(hiram);
        gds.setMessage("Hiram ha entrado al grupo");
        gds.registerObserver(manuel);
        gds.setMessage("Manuel ha entrado al grupo");
        gds.registerObserver(josue);
        gds.setMessage("Josue ha entrado al grupo");
        gds.registerObserver(rene);
        gds.setMessage("Rene ha entrado al grupo");
        gds.registerObserver(pedro);
        gds.setMessage("Pedro ha entrado al grupo");


        gds.setMessage("Pala ha salido del grupo");
        gds.removeObserver(pala);
        gds.setMessage("Jose Luis ha salido del grupo");
        gds.removeObserver(joseLuis);

        gds.setMessage("Mensajes de Andrea: ");
        ((memberObserver) andrea).readMessagesAndClear();
        System.out.println();

        gds.notifyObservers();

        System.out.println("Equipo 1");
        equipo1.registerObserver(andrea);
        equipo1.registerObserver(pala);
        equipo1.registerObserver(joseLuis);
        equipo1.registerObserver(alex);
        equipo1.registerObserver(josue);
        equipo1.registerObserver(rene);

        equipo1.setMessage("Hola equipo 1");
       ((memberObserver) andrea).readMessagesAndClear();


    }
}
