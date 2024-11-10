package es.santander.ascender.proyecto04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testCrearInvirtiendoOrden() {

        Arreglo cut = new Arreglo();
        int[] origenParaLaPrueba = new int[] {3, 6, -1, 0, 7} ;
        
        int[] resultadoDeLaPrueba = cut.crearInvirtiendoOrden(origenParaLaPrueba);
        assertArrayEquals(new int[]{7, 0, -1, 6, 3}, resultadoDeLaPrueba);
    }


    @Test
    public void testDevolverValorEnIndice() throws Exception {
        Arreglo cut = new Arreglo();

        

        float resultado = cut.devolverValorEnIndice(new float[] {4.6f, 3.2F, -34.7f, 0.0f}, 1);

        assertEquals(3.2f, resultado);

    }

    @Test
    public void testSumarValores(){

        // creo el objeto
        Arreglo cut = new Arreglo();
        
        double[] valoresSinDecimales = {1.0, 2.0, 3.0};
        assertEquals(6.0, cut.sumarValores(valoresSinDecimales));

        double[] valoresConDecimales = {-1.5, 4.5, 2.0};
        assertEquals(5.0, cut.sumarValores(valoresConDecimales));

        double[] valoresVacios = {};
        assertEquals(0.0, cut.sumarValores(valoresVacios));      

    }

    @Test
    public void testCalcularMediaValores() throws Exception{

        // creo el objeto
        Arreglo cut = new Arreglo();
     
        double[] valoresMediaSinDecimales = {5.0, 10.0, 15.0};
        assertEquals(10.0, cut.calcularMediaValores(valoresMediaSinDecimales));


        double[] valoresMediaConDecimales = {-5.5, 10.5, 20.3, 4.7};
        assertEquals(7.5, cut.calcularMediaValores(valoresMediaConDecimales));

        double[]valoresMediaVacios = {};
         assertThrows(Exception.class, () -> cut.calcularMediaValores(valoresMediaVacios));

    }
}
