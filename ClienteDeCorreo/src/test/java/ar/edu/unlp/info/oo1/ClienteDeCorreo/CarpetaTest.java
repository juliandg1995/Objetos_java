package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
    private Carpeta c;
    private Email e;
    @BeforeEach
    public void setUp() {
        c = new Carpeta("prueba");
        e = new Email("prueba");
        c.agregarMail(e);
    }
    @Test
    void getNombreTest() {
        assertEquals("prueba", c.getNombre());
    }
    @Test
    void almacenarMailTest() {
        c.agregarMail(e);
        assertTrue(c.contieneMail(e));
    }
    @Test
    void getEmailTest() {
        assertTrue(c.getEmail("prueba") instanceof Email);
    }
    @Test
    void contieneMailTest() {
        //c.almacenarEmail(e);
        assertTrue(c.emails().contains(e));
    }
    @Test
    void borrarMailTest() {
        c.borrarMail(e);
        assertFalse(c.emails().contains(e));
    }
    @Test
    void getEspacioTest() {
        c.agregarMail(new Email("t2"));
        assertEquals(8,c.getEspacio());
    }
}
