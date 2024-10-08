package ejercicios_04.ejercicio01;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

    public static int[] ejercicio1() {
        Random random = new Random();
        int[] lista = new int[3];

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;

        lista[0] = dado1;
        lista[1] = dado2;
        lista[2] = dado3;

        return lista;
    }

    public static void main(String[] args) {
        System.out.println("Tirando 3 dados...");

        int[] lista = ejercicio1();
        System.out.println("Los números que han salido son: " + Arrays.toString(lista));

        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
