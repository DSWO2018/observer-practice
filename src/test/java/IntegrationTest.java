import observers.User;
import observers.WhatsAppUser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import subjects.Grupo;
import subjects.WhatsAppGroup;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class IntegrationTest {
    WhatsAppGroup g;
    WhatsAppUser u1;
    WhatsAppUser u2;
    ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        g = new WhatsAppGroup();
        u1 = new WhatsAppUser("Usuario de Prueba 1");
        u2 = new WhatsAppUser("Usuario de Prueba 2");
        g.addUser(u1);
        g.addUser(u2);
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void chatAndKeep() {
        u1.sendMessage("Hola soy el usuario 1",g);
        u2.sendMessage("Hola usuario 1 soy el usuario 2",g);
        assertEquals(true,u1.readMessagesAndKeep());
        assertEquals("Inbox de Usuario de Prueba 1\n" +
                "Usuario de Prueba 1 has joined the group\n" +
                "Usuario de Prueba 2 has joined the group\n" +
                "Usuario de Prueba 1: \n" +
                "Hola soy el usuario 1\n" +
                "Usuario de Prueba 2: \n" +
                "Hola usuario 1 soy el usuario 2\n" +
                "\n",outContent.toString());
        assertEquals(true,u1.clearMessages());
    }

    @Test
    public void chatAndClear() {
        u1.sendMessage("Hola soy el usuario 1",g);
        u2.sendMessage("Hola usuario 1 soy el usuario 2",g);
        assertEquals(true,u1.readMessagesAndClear());
        assertEquals("Inbox de Usuario de Prueba 1\n" +
                "Usuario de Prueba 1 has joined the group\n" +
                "Usuario de Prueba 2 has joined the group\n" +
                "Usuario de Prueba 1: \n" +
                "Hola soy el usuario 1\n" +
                "Usuario de Prueba 2: \n" +
                "Hola usuario 1 soy el usuario 2\n" +
                "\n",outContent.toString());
        assertEquals(false,u1.clearMessages());
    }

    @Test
    public void chatDesync() {
        u1.sendMessage("Hola soy el usuario 1",g);
        u1.leaveGroup(g);
        u2.sendMessage("Hola usuario 1 soy el usuario 2",g);
        assertEquals(true,u1.readMessagesAndKeep());
        assertEquals("Inbox de Usuario de Prueba 1\n" +
                "Usuario de Prueba 1 has joined the group\n" +
                "Usuario de Prueba 2 has joined the group\n" +
                "Usuario de Prueba 1: \n" +
                "Hola soy el usuario 1\n" +
                "Usuario de Prueba 1 has left the group\n" +
                "\n",outContent.toString());
    }

}
