package ejercicios_04.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio14Test {

    private Ejercicio02 ejercicios;

    @BeforeEach
    public void setUp() {
        ejercicios = new EjerciciosAleatorios();
    }

    @Test
    public void testEjercicio14() {
        boolean[] mayorMenor = {true, false, true, false, true};
        int[] intentos = ejercicios.ejercicio14(mayorMenor);
        assertEquals(5, intentos.length);
        for (int intento : intentos) {
            assertTrue(intento >= 0 && intento <= 100);
        }
    }
}