package ejercicios_02.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static String asignaturaPorDia(String dia) {
        return switch (dia) {
            case "lunes" -> "Matemáticas";
            case "martes" -> "Lengua";
            case "miércoles" -> "Inglés";
            case "jueves" -> "Ciencias";
            case "viernes" -> "Historia";
            default -> "Día no válido";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Día de la semana: ");
        String dia = scanner.nextLine();

        System.out.println("Ha primera hora toca: " + asignaturaPorDia(dia));
    }
}
