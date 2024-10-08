package ejercicios_02.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un caracter para la piramide: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("Selecciona la direccion de la piramide:");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        System.out.print("Introduce la altura de la piramide: ");
        int altura = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(dibujarPiramide(caracter, "arriba", altura));
                break;
            case 2:
                System.out.println(dibujarPiramide(caracter, "abajo", altura));
                break;
            case 3:
                System.out.println(dibujarPiramide(caracter, "izquierda", altura));
                break;
            case 4:
                System.out.println(dibujarPiramide(caracter, "derecha", altura));
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }

        scanner.close();
    }
    public static String dibujarPiramide(char caracter, String direccion, int altura) {
        StringBuilder piramide = new StringBuilder();

        switch (direccion.toLowerCase()) {
            case "arriba":
                for (int i = 0; i < altura; i++) {
                    piramide.append(" ".repeat(altura - i - 1));
                    piramide.append(String.valueOf(caracter).repeat(2 * i + 1));
                    piramide.append("\n");
                }
                break;
            case "abajo":
                for (int i = altura - 1; i >= 0; i--) {
                    piramide.append(" ".repeat(altura - i - 1));
                    piramide.append(String.valueOf(caracter).repeat(2 * i + 1));
                    piramide.append("\n");
                }
                break;
            case "izquierda":
                for (int i = 1; i <= altura; i++) {
                    piramide.append(String.valueOf(caracter).repeat(i)).append("\n");
                }
                for (int i = altura - 1; i > 0; i--) {
                    piramide.append(String.valueOf(caracter).repeat(i)).append("\n");
                }
                break;
            case "derecha":
                for (int i = 1; i <= altura; i++) {
                    piramide.append(" ".repeat(altura - i)).append(String.valueOf(caracter).repeat(i)).append("\n");
                }
                for (int i = altura - 1; i > 0; i--) {
                    piramide.append(" ".repeat(altura - i)).append(String.valueOf(caracter).repeat(i)).append("\n");
                }
                break;
            default:
                throw new IllegalArgumentException("Direccion no valida");
        }

        return piramide.toString();
    }
}