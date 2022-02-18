package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
    private ClienteDeCorreo c;
    private Email e;
    @BeforeEach
    void setUp() throws Exception {
        c = new ClienteDeCorreo();
        e = new Email("Prueba");
        c.recibir(e);
    }
    @Test
    void buscar() {
        assertEquals(e,c.buscar("Prueba"));
    }
}
