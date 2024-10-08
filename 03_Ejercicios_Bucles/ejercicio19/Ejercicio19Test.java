package ejercicios_03.ejercicio19;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio19Test {

    @Test
    public void testEjercicio19() {
        List<String> esperados = Arrays.asList(
                "    *",
                "   ***",
                "  *****",
                " *******",
                "*********"
        );
        assertEquals(esperados, Ejercicio19.ejercicio19(5, "*"));

        esperados = Arrays.asList(
                "   #",
                "  ###",
                " #####",
                "#######"
        );
        assertEquals(esperados, Ejercicio19.ejercicio19(4, "#"));

        esperados = Arrays.asList(
                "  @",
                " @@@",
                "@@@@@"
        );
        assertEquals(esperados, Ejercicio19.ejercicio19(3, "@"));
    }
}