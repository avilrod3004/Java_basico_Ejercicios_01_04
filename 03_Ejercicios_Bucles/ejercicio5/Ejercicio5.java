package ejercicios_03.ejercicio5;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio5 {

    public List<Integer> ejercicio5() {
        List<Integer> numeros = new ArrayList<>();
        int i = 320;

        while (i >= 160) {
            numeros.add(i);
            i -= 20;
        }
        return numeros;
    }

}
