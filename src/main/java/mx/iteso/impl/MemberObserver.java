package mx.iteso.impl;

import mx.iteso.Observer;
import java.util.ArrayList;
/**Clase observer member observer. */
public class MemberObserver implements Observer {
    /**ArrayList mensajes. */
    private ArrayList<String> messages;
    /**Sting nombre. */
    private String memberName;

    /**Constructor @param name .*/
    public MemberObserver(final String name) {
        memberName = name;
        messages = new ArrayList<String>();
    }

    /**@return .*/
    public final String getName() {
        return this.memberName;
    }

    /**@param message .*/
    public final void getMessage(final String message) {
        messages.add(message);
    }

    /**@return .*/
    public final boolean readMessagesAndClear() {
        if (messages.isEmpty()) {
            return false;
        } else {
            while (messages.size() > 0) {
                System.out.println(messages.get(messages.size() - 1));
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

    /**@return .*/
    public final boolean readMessagesAndKeep() {
        if (messages.isEmpty()) {
            return false;
        } else {
            int temp = messages.size() - 1;
            while (temp >= 0) {
                System.out.println(messages.get(temp));
                temp = temp - 1;
            }
            return true;
        }
    }

    /**@return .*/
    public final boolean clearMessages() {
        if (messages.isEmpty()) {
            return false;
        } else {
            while (messages.size() > 0) {
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

}

