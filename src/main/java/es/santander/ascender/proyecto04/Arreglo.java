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

    public int[] crearInvirtiendoOrden(int[] origen) {
        int[] destino = new int[origen.length];

        /*
            destino[destino.length-1] = origen[0];
            destino[destino.length-2] = origen[1];
            destino[destino.length-3] = origen[2];
            ...
            destino[0]= origen[origen.length -1];
        */

        /* 
            for (int i = 0, j = destino.length -1 ; i < origen.length && j >= 0 ; i = i +1, j = j -1) {
                destino[j] = origen[i];
            }
        */

        for (int i = 0 ; i < origen.length ; i = i +1) {
            destino[destino.length - (i + 1)] = origen[i];
        }

        return destino;
    }
}
