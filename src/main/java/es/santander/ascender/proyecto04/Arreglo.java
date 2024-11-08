package es.santander.ascender.proyecto04;

public class Arreglo {
    private static final int TAMANO = 100;

    public int[] crearCienPrimeros() {
        int[] resultado = new int[TAMANO];
        for(int i = 0 ; i < TAMANO; i = i + 1) {
            resultado[i] = i;
        }
        return resultado;
    }
}
