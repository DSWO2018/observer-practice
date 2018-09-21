import observers.User;
import observers.WhatsAppUser;
import org.junit.Test;
import org.junit.Before;
import subjects.WhatsAppGroup;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class WhatsAppGroupTest {
    WhatsAppGroup g;
    User u;
    @Before
    public void setUp() {
        g = new WhatsAppGroup();
        u = mock(User.class);

    }

    @Test
    public void addUser() {
        when(u.getName()).thenReturn("Usuario de Prueba");
        g.addUser(u);
        // No hay assert equals porque regresa void
    }

    @Test
    public void dispatchMessages() {

    }


    @Test
    public void removeUser() {
        when(u.getName()).thenReturn("Usuario de Prueba");
        assertEquals(true, g.removeUser(u));

        assertEquals(false, g.removeUser(u));
    }
}
