package ejercicios_03.ejercicio12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio12Test {

    @Test
    public void testEjercicio12() {
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(esperados, Ejercicio12.ejercicio12(6));
    }
}