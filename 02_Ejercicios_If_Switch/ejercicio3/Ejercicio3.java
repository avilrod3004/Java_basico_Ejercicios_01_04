package ejercicios_02.ejercicio3;

import validaciones.ValidarEntrada;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Ejercicio3 {

    public static String nombreDiaSemana(int numero) {
        return switch (numero) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número no válido";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = ValidarEntrada.entradaEntero("Número del día de la semana: ", scanner);

        System.out.println(nombreDiaSemana(numero));
        scanner.close();
    }
}
