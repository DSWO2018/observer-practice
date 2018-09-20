package mx.iteso;

import mx.iteso.observer.WAppUser;
import mx.iteso.subject.Group;
import mx.iteso.subject.WAppGroup;

final class Chat {

      public static void main(final String[] args ) {

        Group grupoDisenoDeSoftware = new WAppGroup();
        WAppUser JosueM = new WAppUser();
        WAppUser rodrigoVillalobos = new WAppUser();
        grupoDisenoDeSoftware.addUser(JosueM);
        grupoDisenoDeSoftware.addUser(rodrigoVillalobos);

    }
}
