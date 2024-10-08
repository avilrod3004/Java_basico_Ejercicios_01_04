package ejercicios_02.ejercicio15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    void testDibujarPiramide() {
        String expectedPiramide =
                        "  *  \n" +
                        " *** \n" +
                        "*****\n";
        assertEquals(expectedPiramide, EjerciciosSwitch.dibujarPiramide('*', "arriba", 3));
    }
}