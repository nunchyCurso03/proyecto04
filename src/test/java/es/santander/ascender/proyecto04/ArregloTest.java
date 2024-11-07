package es.santander.ascender.proyecto04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ArregloTest {
    @Test
    public void testCrearCienPrimeros() {
        Arreglo arreglo = new Arreglo();

        int[] resultado = arreglo.crearCienPrimeros();

        assertNotNull(resultado);
        assertEquals(100, resultado.length);
        for (int i = 0 ; i < 100; i++) {
            assertEquals(i, resultado[i]);
        }

        
    }
}
