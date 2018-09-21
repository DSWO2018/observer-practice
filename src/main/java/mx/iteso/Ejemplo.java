package mx.iteso;
import mx.iteso.RodrigoVillalobos;

public class Ejemplo {
    public static void main(final String[] args ) {

            Equipo grupoDisenoDeSoftware = new GrupoDisenoSoftware();
        Equipo ExEquipo1 = new GrupoDisenoSoftware();

        RodrigoVillalobos rodrigoVillalobos = new RodrigoVillalobos();
        RodrigoVillalobos Alejandro = new RodrigoVillalobos();
        RodrigoVillalobos Andrea = new RodrigoVillalobos();
        RodrigoVillalobos PAlafox = new RodrigoVillalobos();
        RodrigoVillalobos josue = new RodrigoVillalobos();
        RodrigoVillalobos Alan  = new RodrigoVillalobos();
        RodrigoVillalobos Hiram = new RodrigoVillalobos();
        RodrigoVillalobos Juan = new RodrigoVillalobos();
        RodrigoVillalobos Manuel = new RodrigoVillalobos();
        RodrigoVillalobos Pedro = new RodrigoVillalobos();
        RodrigoVillalobos Gabriel = new RodrigoVillalobos();




        grupoDisenoDeSoftware.addUser(rodrigoVillalobos);
        grupoDisenoDeSoftware.addUser(Gabriel);
        grupoDisenoDeSoftware.addUser(Pedro);
        grupoDisenoDeSoftware.addUser(Manuel);
        grupoDisenoDeSoftware.addUser(Juan);
        grupoDisenoDeSoftware.addUser(Hiram);
        grupoDisenoDeSoftware.addUser(Alan);
        grupoDisenoDeSoftware.addUser(josue);
        grupoDisenoDeSoftware.addUser(PAlafox);
        grupoDisenoDeSoftware.addUser(Andrea);
        grupoDisenoDeSoftware.addUser(Alejandro);

        ExEquipo1.addUser(Gabriel);
        ExEquipo1.addUser(Manuel);
        ExEquipo1.addUser(Hiram);
        ExEquipo1.addUser(Pedro);
        ExEquipo1.addUser(Alan);
        ExEquipo1.addUser(Juan);





    }
}