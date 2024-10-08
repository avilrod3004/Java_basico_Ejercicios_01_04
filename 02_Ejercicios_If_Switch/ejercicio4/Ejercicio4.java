package ejercicios_02.ejercicio4;

import validaciones.ValidarEntrada;

import java.util.Scanner;

public class Ejercicio4 {

    public static int calcularSalarioSemanal(int horas) {
        int salarioSemanal = 0;

        if (horas <= 40) {
            salarioSemanal = horas * 12;
        } else {
            int horasExtra = horas - 40;
            salarioSemanal = 40 * 12;
            salarioSemanal += horasExtra * 16;
        }

        return salarioSemanal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas = ValidarEntrada.entradaEntero("Introduzca el valor de horas: ", scanner);

        System.out.print(calcularSalarioSemanal(horas));
        scanner.close();
    }
}
