package mx.iteso;

import mx.iteso.implement.WhatsGroup;
import mx.iteso.implement.GrupoDisenoSoftware;
import mx.iteso.implement.Member;

public class Group {
    public static void main( String[] args){
        GrupoDisenoSoftware gruposoft;
        gruposoft = new GrupoDisenoSoftware();

        WhatsGroup grupowhats;
        grupowhats = new WhatsGroup();

        Observer jenny = new Member();
        Observer grace = new Member();
        Observer jaqui = new Member();
        Observer rena = new Member();
        Observer criss = new Member();

        System.out.println("Grupo de Diseño de Software");
        gruposoft.registerObserver(jenny);
        gruposoft.setMessage("Jenny se unió al grupo");
        gruposoft.registerObserver(jaqui);
        gruposoft.setMessage("Jaqui se unió al grupo");
        gruposoft.registerObserver(rena);
        gruposoft.setMessage("Rena se unió al grupo");
        gruposoft.registerObserver(criss);
        gruposoft.setMessage("Criss se unió al grupo");
        gruposoft.registerObserver(grace);
        gruposoft.setMessage("Grace se unió al grupo");

        gruposoft.setMessage("Grace se ha salido del chat");
        gruposoft.removeObserver(grace);
        gruposoft.setMessage("Criss se ha salido del chat");
        gruposoft.removeObserver(criss);

        gruposoft.setMessage("Mostrando mensajes de Jenny: ");
        ((Member) jenny).readMessagesAndClear();
        System.out.println();

        gruposoft.notifyObservers();
    }
}