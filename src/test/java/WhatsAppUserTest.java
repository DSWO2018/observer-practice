import observers.User;
import observers.WhatsAppUser;
import org.junit.Before;
import org.junit.Test;
import subjects.Grupo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class WhatsAppUserTest {
    Grupo g;
    WhatsAppUser u;
    @Before
    public void setUp() {
        g = mock(Grupo.class);
        u = new WhatsAppUser("Usuario de Prueba");
    }

    @Test
    public void getName() {
        assertEquals("Usuario de Prueba", u.getName());
    }
}
