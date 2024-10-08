package ejercicios_02.ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @ParameterizedTest
    @CsvSource({
            "6, Buenos días",
            "12, Buenos días",
            "13, Buenas tardes",
            "20, Buenas tardes",
            "21, Buenas noches",
            "5, Buenas noches",
            "24, Hora no válida"
    })
    void testSaludoPorHora(int hora, String expectedSaludo) {
        assertEquals(expectedSaludo, Ejercicio2.saludoPorHora(hora));
    }
}