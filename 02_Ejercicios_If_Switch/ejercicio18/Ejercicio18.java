package ejercicios_02.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static int obtenerPrimeraCifra(int numero) {
        numero = Math.abs(numero);
        while (numero >= 10) {
            numero /= 10;
        }
        return numero;
    }
}