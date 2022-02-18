package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
    private Archivo a;
    @BeforeEach
    public void setUp() {
        a = new Archivo("prueba");
        a.setNombre("prueba");
    }
    @Test
    void getNombreTest() {
        assertEquals("prueba", a.getNombre());
    }
    @Test
    void getTamanioTest() {
        assertEquals(6.0,a.getTamanio());
    }
}
