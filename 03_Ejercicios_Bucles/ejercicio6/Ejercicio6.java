package ejercicios_03.ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio6 {

    public List<Integer> ejercicio6() {
        List<Integer> numeros = new ArrayList<>();
        int i = 320;

        do {
            numeros.add(i);
            i -= 20;
        } while (i >= 160);

        return numeros;
    }

}
