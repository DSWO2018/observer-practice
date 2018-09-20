import observers.WhatsAppUser;
import subjects.Grupo;
import subjects.WhatsAppGroup;

/**
 * ejemplo de como funciona el programa.
 */
final class Conversation {

    /**
     * Prevent instantiation.
     */
    private Conversation() {
    }

    /**
     * Funcionando
     * @param args args.
     */
    public static void main(final String[] args ) {
        /**
         * checkstyle odia las ñ.
         */
        Grupo grupoDisenoDeSoftware = new WhatsAppGroup();

        /**
         * Usted profe.
         */
        WhatsAppUser rodrigoVillalobos = new WhatsAppUser();
        /**
         * yo merengues.
         */
        WhatsAppUser gabrielCampollo = new WhatsAppUser();

        /**
         * Error: aliPasos is not a member of Diseño de Software.
         */
        WhatsAppUser aliPasos = new WhatsAppUser();

        grupoDisenoDeSoftware.addUser(rodrigoVillalobos);
        grupoDisenoDeSoftware.addUser(gabrielCampollo);
        grupoDisenoDeSoftware.addUser(aliPasos);

    }
}
