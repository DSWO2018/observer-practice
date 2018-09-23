package mx.iteso;

import java.util.ArrayList;

/**
 * Created by Alan on 9/20/18.
 */
public class Palafox implements Observer {
    /**Messages list.*/
    private ArrayList<String> messages;
    /**Update function.
     * @param pmessages .*/
    public final void update(final ArrayList<String> pmessages) {
        this.messages = pmessages;
    }
}
