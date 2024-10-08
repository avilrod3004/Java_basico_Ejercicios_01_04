package ejercicios_02.ejercicio2;

import validaciones.ValidarEntrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static String saludoPorHora(int hora) {
        if (hora >= 6 && hora <= 12) {
            return "Buenos días";
        } else if (hora >= 13 && hora <= 20) {
            return "Buenas tardes";
        } else if ((hora >= 21 && hora < 24) || (hora >= 0 && hora <= 5)) {
            return "Buenas noches";
        } else {
            return "Hora no válida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora = ValidarEntrada.entradaEntero("Hora: ", scanner);

        System.out.println(saludoPorHora(hora));
        scanner.close();
    }
}
