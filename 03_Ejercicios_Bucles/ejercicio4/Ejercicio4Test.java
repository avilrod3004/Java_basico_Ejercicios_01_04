package ejercicios_03.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test {

    private Ejercicio4 ejercicios;

    @Test
    public void testEjercicio4() {
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicios.ejercicio4());
    }

}

