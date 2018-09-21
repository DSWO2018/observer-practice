package mx.iteso;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    public static void main(String[] args) {
        GrupoDisenoSoftware grupo2018B = new GrupoDisenoSoftware();
        GrupoDisenoSoftware equipo2 = new GrupoDisenoSoftware();
        List<Observer> grupoMemberList = new ArrayList<Observer>();
        List<Observer> equipoMemberList = new ArrayList<Observer>();

        for (int i = 0; i < 12; i++) {
            grupoMemberList.add(new RodrigoVillalobos());
            grupo2018B.registerObserver(grupoMemberList.get(i));
        }

        for (int i = 0; i < 4; i++) {
            equipoMemberList.add(grupoMemberList.get(i));
            equipo2.registerObserver(grupoMemberList.get(i));
        }

        grupo2018B.sendMessage("Límite para reqs: sabado 23");
        equipo2.sendMessage("Rolenlos");

        System.out.println("Miembros del grupo");
        for (Observer observer : grupoMemberList) {
            System.out.println(observer.getMessages());
        }

        System.out.println("Miembros del equipo");
        for (Observer observer : equipoMemberList) {
            System.out.println(observer.getMessages());
        }

    }
}
