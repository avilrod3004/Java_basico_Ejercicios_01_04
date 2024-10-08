package ejercicios_04.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio15 {

    public static String ejercicio15() {
        Random random = new Random();
        List<String> melodia = new ArrayList<>();

        String[] notas = new String[] {"do", "re", "mi", "fa", "sol", "la", "si"};
        int compases = random.nextInt(7) + 1;

        for (int i = 1; i <= compases; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == compases && j == 3) {
                    melodia.add(melodia.get(0));
                } else {
                    int indiceNota = random.nextInt(notas.length);
                    melodia.add(notas[indiceNota]);
                }
            }

            if (i < compases) {
                melodia.add("|");
            }
        }
        melodia.add("||");

        return String.join(" ", melodia);

    }

    public static void main(String[] args) {
        System.out.println(ejercicio15());
    }
}
