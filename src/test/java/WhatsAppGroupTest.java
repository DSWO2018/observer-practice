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
        g.addUser(u);
        // No hay assert equals porque regresa void
    }

    @Test
    public void dispatchMessages() {
        g.addUser(u);
        g.dispatchMessage("This test is kinda pointless");
        // No hay assert equals porque regresa void
    }


    @Test
    public void removeUser() {
        g.addUser(u);
        assertEquals(true, g.removeUser(u));
        assertEquals(false, g.removeUser(u));
    }
}
