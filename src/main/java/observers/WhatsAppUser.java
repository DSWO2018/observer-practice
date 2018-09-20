package observers;

import java.util.ArrayList;

/**
 * clase.
 */
public class WhatsAppUser implements User {

    /**
     * Lista de mensajes.
     */
    private ArrayList<String> messages;

    /**
     * @param message mensaje.
     */
    public void getMessage(final String message) {
        messages.add(message);
    }

    /**
     * @return whether any messages were read.
     */
    public boolean readMessagesAndClear() {
        if (messages.isEmpty()) {
            return false;
        } else {
            while (messages.size() > 0) {
                System.out.println(messages.get(messages.size()));
                messages.remove(messages.size());
            }
            return true;
        }
    }

    /**
     * @return whether any messages were read.
     */
    public boolean readMessagesAndKeep() {
        if (messages.isEmpty()) {
            return false;
        } else {
            int temp = messages.size();
            while (temp > 0) {
                System.out.println(messages.get(temp));
                temp = temp - 1;
            }
            return true;
        }
    }

    /**
     * @return whether any messages were cleared.
     */
    public boolean clearMessages() {
        if (messages.isEmpty()) {
            return false;
        } else {
            while (messages.size() > 0) {
                messages.remove(messages.size());
            }
            return true;
        }
    }

}
