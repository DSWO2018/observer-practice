package mx.iteso;

/**
 * Created by Alan on 9/20/18.
 */

import java.util.ArrayList;

/**Alejandro Member Class.*/
public class Alejandro implements Observer {
    /**Messages list.*/
    private ArrayList<String> messages;
    /**Update function.
     * @param pmessages .*/
    public final void update(final ArrayList<String> pmessages) {
        this.messages = pmessages;
    }
}
