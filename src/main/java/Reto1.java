///*
// * Escribe un programa que muestre por consola (con un print) los
// * números de 1 a 100 (ambos incluidos y con un salto de línea entre
// * cada impresión), sustituyendo los siguientes:
// * - Múltiplos de 3 por la palabra "fizz".
// * - Múltiplos de 5 por la palabra "buzz".
// * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
// */
//

public class Reto1 {

    private Integer i;

    void function() {
        for (i = 1; i <= 100; i++) {
            if (divisiblePor3(i)) {
                System.out.println("fizz");
            } else if (divisiblePor5(i)) {
                System.out.println("buzz");
            } else if (divisiblePor3y5(i)) {
                System.out.println("fizzbuzz");

            }

        }
    }

    private boolean divisiblePor3y5(Integer i) {
        return (i % 3) == 0 && (i % 5) == 0;
    }

    private boolean divisiblePor5(Integer i) {
        return (i % 5) == 0;
    }

    private boolean divisiblePor3(Integer i) {
        return (i % 3) == 0;
    }
}


