package mx.iteso.impl;

import mx.iteso.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class Equipo1Test {
    Equipo1 e1;
    String msg;
    Observer o;

    @Before
    public void setUp(){
        e1 = new Equipo1();
        o = mock(Observer.class);
    }

    @Test
    public void registerObserver() {
        e1.registerObserver(o);
    }

    @Test
    public void removeObserver() {
        e1.removeObserver(o);
    }

    @Test
    public void notifyObservers() {
        e1.notifyObservers();
    }

    @Test
    public void setMessage() {
        e1.setMessage(msg);
    }
}