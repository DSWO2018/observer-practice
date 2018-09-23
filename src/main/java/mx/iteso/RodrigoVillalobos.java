package mx.iteso;

import java.util.ArrayList;
/**RodrigoVillalobos Member Class.*/
public class RodrigoVillalobos implements Observer {
    /**Var messages. */
    private ArrayList<String> messages;
    /**function update.
     * @param pmessages .*/
    public final void update(final ArrayList<String> pmessages) {
        this.messages = pmessages;
    }
    /**function getmessage.
     * @param message .*/
    public final void getMessage(final String message) {
        messages.add(message);
    }
    /**function readMessageAndClear.
     * @return . */
    public final boolean readMessagesAndClear() {
        if (messages.isEmpty()) {
            return false;
        } else {
            while ((messages.size() - 1) > 0) {
                System.out.println(messages.get(messages.size()));
                messages.remove(messages.size());
            }
            return true;
        }
    }
    /**function readMessagesAndKeep.
     * @return .*/
    public final boolean readMessagesAndKeep() {
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
    /**function clearMessages.
     * @return .*/
    public final boolean clearMessages() {
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
