package ejercicios_03.ejercicio12;

import validaciones.ValidarEntrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static List<Integer> ejercicio12(int numero) {
        List<Integer> serie = new ArrayList<Integer>();
        int penultimo = -1;
        int ultimo = -1;

        for (int i = 0; i < numero; i++) {
            if (penultimo == -1 && ultimo == -1) {
                serie.add(0);
                ultimo = 0;
            } else if (penultimo == -1) {
                serie.add(1);
                penultimo = 0;
                ultimo = 1;
            } else {
                serie.add(penultimo + ultimo);
                penultimo = ultimo;
                ultimo = serie.get(i);
            }
        }

        return serie;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = ValidarEntrada.entradaEntero("Ingresa el número de términos de la serie de Fibonacci que quieres ver: ", scanner);
        scanner.close();

        if (numero != -1) {
            System.out.println(ejercicio12(numero));
        }

    }
}
