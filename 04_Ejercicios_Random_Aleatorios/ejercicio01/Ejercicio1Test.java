package ejercicios_04.ejercicio01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    public void testEjercicio1() {
        int[] dados = Ejercicio1.ejercicio1();
        assertEquals(3, dados.length);
        for (int dado : dados) {
            assertTrue(dado >= 1 && dado <= 6);
        }
    }
}