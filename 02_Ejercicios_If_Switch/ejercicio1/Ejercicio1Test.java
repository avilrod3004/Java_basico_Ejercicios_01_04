package ejercicios_02.ejercicio1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ejercicio1Test {

    @ParameterizedTest
    @CsvSource({
            "lunes, Matemáticas",
            "martes, Lengua",
            "miércoles, Inglés",
            "jueves, Ciencias",
            "viernes, Historia",
            "sábado, Día no válido"
    })
    void testAsignaturaPorDia(String dia, String expectedAsignatura) {
        assertEquals(expectedAsignatura, Ejercicio1.asignaturaPorDia(dia));
    }
}