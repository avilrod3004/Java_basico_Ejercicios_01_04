package ejercicios_03.ejercicio15;

import validaciones.ValidarEntrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio15 {
    public static List<Double> ejercicio15(int base, int exponente) {
        List<Double> potencias = new ArrayList<>();

        for(int i = 1; i <= exponente; i++) {
            if (i == 1) {
                potencias.add((double) base);
            } else {
                int total = base;
                for (int j = i; j > 1; j--) {
                    total *= base;
                }

                potencias.add((double) total);
            }
        }

        return potencias;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = ValidarEntrada.entradaEntero("Base: ", scanner);
        int exponente = ValidarEntrada.entradaEntero("Exponente: ", scanner);
        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Base: ");
//        int base = scanner.nextInt();
//
//        System.out.print("Exponente: ");
//        int exponente = scanner.nextInt();

        System.out.println(ejercicio15(base, exponente));
    }
}
