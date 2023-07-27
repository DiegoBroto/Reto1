package Retos;///*
// * Escribe un programa que muestre por consola (con un print) los
// * números de 1 a 100 (ambos incluidos y con un salto de línea entre
// * cada impresión), sustituyendo los siguientes:
// * - Múltiplos de 3 por la palabra "fizz".
// * - Múltiplos de 5 por la palabra "buzz".
// * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
// */
//

public class Reto0 {


    public static void main(String[] args) {

        int contAmbos = 0;
        int contTres = 0;
        int contCinco = 0;
        int contNoDiv = 0;

        for (int i = 1; i <= 100; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                contAmbos ++;
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                contCinco ++;
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                contTres ++;
                System.out.println("fizz");
            } else {
                contNoDiv ++;
                System.out.println(i);

            }

        }
        System.out.println("Cant. Multiplo de 3 = " + contTres);
        System.out.println("Cant. Multiplo de 5 = " + contCinco);
        System.out.println("Cant. Multiplo de 3 y 5 = " + contAmbos);
        System.out.println("Cant. sin Multiplo = " + contNoDiv);
    }
}

