package mx.iteso;

/**
 * Created by Alan on 9/22/18.
 */
public class Main {
    /**Functión Main.
     * @param args .*/
    private static void main(final String args) {
        Observer alanPerez = ((Observer) new AlanPerez());
        Observer alejandro = ((Observer) new Alejandro());
        Observer andrearayon = ((Observer) new AndreaRayon());
        Observer gabrielcampollo = ((Observer) new GabrielCampollo());
        Observer joseluis = ((Observer) new JoseLuis());
        Observer manuelsanchez = ((Observer) new ManuelSanchez());
        Observer palafox = ((Observer) new Palafox());
        Observer pedrogtz = ((Observer) new PedroGtz());
        Observer rodrigovillalobos = ((Observer) new RodrigoVillalobos());
        GrupoDisenoSoftware grupoclase = new GrupoDisenoSoftware();
        ExEquipo1 grupoequipo = new ExEquipo1();

        grupoclase.addObserver(alanPerez);
        grupoclase.addObserver(alejandro);
        grupoclase.addObserver(andrearayon);
        grupoclase.addObserver(gabrielcampollo);
        grupoclase.addObserver(joseluis);
        grupoclase.addObserver(manuelsanchez);
        grupoclase.addObserver(palafox);
        grupoclase.addObserver(pedrogtz);
        grupoclase.addObserver(rodrigovillalobos);

        grupoequipo.addObserver(alanPerez);
        grupoequipo.addObserver(gabrielcampollo);
        grupoequipo.addObserver(manuelsanchez);
        grupoequipo.addObserver(pedrogtz);


    }
}
