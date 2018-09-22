package mx.iteso.impl;
import mx.iteso.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GrupoDisenoSoftwareTest {
    GrupoDisenoSoftware gds;
    String msg;
    Observer o;


    @Before
    public void setUp() {
        gds = new GrupoDisenoSoftware();
        o = mock(Observer.class);
    }

    @Test
    public void registerObserver() {
        gds.registerObserver(o);
    }

    @Test
    public void removeObserver() {
        gds.removeObserver(o);
    }

    @Test
    public void notifyObservers() {
        gds.notifyObservers();
    }

    @Test
    public void setMessage() {
        gds.setMessage(msg);
    }
}