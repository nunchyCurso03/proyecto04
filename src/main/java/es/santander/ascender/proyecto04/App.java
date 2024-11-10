package es.santander.ascender.proyecto04;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int resultado = Calculadora.sumar(4, 5);

        Calculadora variableCalculadora = new Calculadora();
         
        int resultadoResta = variableCalculadora.restar(4, 3);
        int resultadoSuma = variableCalculadora.sumar(4, 5);

        System.out.println("la resta: " + " =" + resultadoResta);
        System.out.println("la suma: " + " =" + resultadoSuma);
        

        try {
            // Crear una instancia de la clase Arreglo
            Arreglo arreglo = new Arreglo();

            // Crear un array de prueba
            double[] valores = {5.0, 10.0, 15.0, 32.15};

            // Llamar al método calcularMediaValores y almacenar el resultado
            double media = arreglo.calcularMediaValores(valores);

            // Imprimir el resultado en la consola
            System.out.println("La media de los valores =: " + media);

        } catch (Exception e) {
            // Imprimir el mensaje de la excepción si ocurre algún error
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
    }
 