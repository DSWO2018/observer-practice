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
     * Funcionando.
     * @param args args.
     */
    public static void main(final String[] args) {
        /**
         * checkstyle odia las ñ.
         */
        Grupo grupoDisenoDeSoftware = new WhatsAppGroup();

        /**
         * Usted profe.
         */
        WhatsAppUser rodrigoVillalobos = new WhatsAppUser("Rodrigo Villalobos");

        /**
         * yo merengues.
         */
        WhatsAppUser gabrielCampollo = new WhatsAppUser("Gabriel Campollo");


        /**
         * Error: aliPasos should not be a member of Diseño de Software.
         */
        WhatsAppUser aliPasos = new WhatsAppUser("Ali Rafael Pasos");

        grupoDisenoDeSoftware.addUser(rodrigoVillalobos);
        grupoDisenoDeSoftware.addUser(gabrielCampollo);
        grupoDisenoDeSoftware.addUser(aliPasos);
        rodrigoVillalobos.sendMessage(
                "Hola a todos, bienvenidos al grupo de diseño de software",
                grupoDisenoDeSoftware);

        aliPasos.leaveGroup(grupoDisenoDeSoftware);
        gabrielCampollo.sendMessage(
                "Hola profe espero que tengamos buen semestre",
                grupoDisenoDeSoftware);


        aliPasos.readMessagesAndKeep();

        // Esto es sólo para probar que clearMessages funciona
        aliPasos.clearMessages();
        aliPasos.readMessagesAndKeep();


        rodrigoVillalobos.readMessagesAndClear();

        // Esto es sólo para probar que readMessagesAndClear si los limpia
        rodrigoVillalobos.readMessagesAndKeep();

    }
}
