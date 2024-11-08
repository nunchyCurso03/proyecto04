package es.santander.ascender.proyecto04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ArregloTest {
    private static final int TAMANO_REQUERIDO = 100;

    @Test
    public void testCrearCienPrimeros() {
        Arreglo arreglo = new Arreglo();

        int[] resultado = arreglo.crearCienPrimeros();

        assertNotNull(resultado, "El array recibido de la creación no debe ser nulo");
        assertEquals(TAMANO_REQUERIDO, resultado.length, "Esperaba que arreglo fuera de tamaño 100");
        for (int i = 0 ; i < TAMANO_REQUERIDO; i++) {
            assertEquals(i, resultado[i]);
        }

        
    }
}
