package ejercicios_03.ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio4 {

    public List<Integer> ejercicio4() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 320; i >= 160; i -= 20) {
            numeros.add(i);
        }

        return numeros;
    }

    public List<Integer> ejercicio5() {
        List<Integer> numeros = new ArrayList<>();
        int i = 320;

        // Bucle while que cuenta de 20 en 20 hacia atrás desde 320 hasta 160
        while (i >= 160) {
            numeros.add(i);
            i -= 20;
        }

        return numeros;
    }

    public List<Integer> ejercicio6() {
        List<Integer> numeros = new ArrayList<>();
        int i = 320;

        // Bucle do-while que cuenta de 20 en 20 hacia atrás desde 320 hasta 160
        do {
            numeros.add(i);
            i -= 20;
        } while (i >= 160);

        return numeros;
    }

}
