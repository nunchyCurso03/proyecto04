package es.santander.ascender.proyecto04;

public class Arreglo {
    public int[] crearCienPrimeros() {
        int[] resultado = new int[100];
        for(int i = 0 ; i < 100; i = i + 1) {
            resultado[i] = i;
        }
        return resultado;
    }
}
