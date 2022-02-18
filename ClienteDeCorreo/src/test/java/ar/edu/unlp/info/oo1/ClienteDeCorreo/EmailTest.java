package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
    private String titulo;
    private String cuerpo;
    private ArrayList<Archivo> adjuntos;
    private Email e;
    @BeforeEach
    void setUp() throws Exception {
        titulo = new String();
        cuerpo = new String();
        adjuntos = new ArrayList<Archivo>();
        e = new Email("Prueba");
    }
    @Test
    void tamanio() {
        this.adjuntos.add(new Archivo("Prueba"));
        assertEquals(6,e.tamanio());
    }
}
