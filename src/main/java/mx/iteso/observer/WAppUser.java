package mx.iteso.observer;

import java.util.ArrayList;

public class WAppUser implements User {

    private ArrayList<String> msg;

    public void getMessage(String message) {
        msg.add(message);
    }


    public boolean readMessagesAndClear() {
        if (msg.isEmpty()) {
            return false;
        } else {
            while (msg.size() > 0) {
                System.out.println(msg.get(msg.size()));
                msg.remove(msg.size());
            }
            return true;
        }
    }

    public boolean readMessagesAndKeep() {
        if (msg.isEmpty()) {
            return false;
        }else {
            int var = msg.size();
            while (var > 0) {
                System.out.println(msg.get(var));
                var = var - 1;
            }
            return true;
        }
    }


    public boolean clearMessages() {
        if (msg.isEmpty()) {
            return false;
        } else {
            while (msg.size() > 0) {
                msg.remove(msg.size());

            }
            return true;
        }
    }


}
