package ejercicios_03.ejercicio19;

import validaciones.ValidarEntrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio19 {

    public static List<String> ejercicio19(int altura, String caracter) {
        List<String> lista = new ArrayList<>();
        int anterior = 0;

        for (int i = 1; i <= altura; i++) {
            String nivel = " ".repeat(altura - i) + caracter.repeat(i + anterior);
            lista.add(nivel);
            anterior++;
        }

        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura = ValidarEntrada.entradaEntero("Altura de la pirámide: ", scanner);

        System.out.print("Caracter de la cadena: ");
        String caracter = scanner.next();

        System.out.println(ejercicio19(altura, caracter));
    }
}
