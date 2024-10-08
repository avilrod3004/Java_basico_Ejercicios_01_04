package ejercicios_04.ejercicio14;

import java.util.Random;

public class Ejercicio14 {

    public int[] ejercicio14(boolean[] mayorMenor) {
        int[] intentos = new int[5];
        Random random = new Random();
        int min = 0;
        int max = 100;


        for (int i = 0; i < 5; i++) {
            int intento = random.nextInt(max - min + 1) + min;
            intentos[i] = intento;

            if (mayorMenor[i]) {
                min = intento + 1;
            } else {
                max = intento - 1;
            }
        }

        return intentos;
    }
}
