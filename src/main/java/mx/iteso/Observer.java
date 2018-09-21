package mx.iteso;

import java.util.ArrayList;

public interface Observer {
    void setMessage(String message);
    ArrayList<String> getMessages();
    boolean readMessagesAndClear();
    boolean readMessagesAndKeep();
    boolean clearMessages();
}
