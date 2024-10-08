package ejercicios_04.ejercicio02;

import java.util.Random;

public class Ejercicio02 {
    public String ejercicio2() {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        String paloAleatorio = palos[random.nextInt(palos.length)];
        String cartaAleatoria = cartas[random.nextInt(cartas.length)];

        return cartaAleatoria + " de " + paloAleatorio;
    }
}
