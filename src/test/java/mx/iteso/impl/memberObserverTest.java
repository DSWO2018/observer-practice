package mx.iteso.impl;

import mx.iteso.Subject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class memberObserverTest {
    Subject s;
    MemberObserver mo;

    @Before
    public void setUp(){
        s = mock(Subject.class);
        mo = new MemberObserver("Andrea");
    }

    @Test
    public void getName() {
        assertEquals("Andrea", mo.getName());
    }
}