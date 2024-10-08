package ejercicios_03.ejercicio15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    public void testEjercicio15() {
        List<Double> esperados = Arrays.asList(2.0, 4.0, 8.0, 16.0, 32.0);
        assertEquals(esperados, Ejercicio15.ejercicio15(2, 5));
    }
}