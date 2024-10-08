package ejercicios_02.ejercicio3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @ParameterizedTest
    @CsvSource({
            "1, Lunes",
            "2, Martes",
            "3, Miércoles",
            "4, Jueves",
            "5, Viernes",
            "6, Sábado",
            "7, Domingo",
            "8, Número no válido"
    })
    void testNombreDiaSemana(int numero, String expectedDia) {
        assertEquals(expectedDia, Ejercicio3.nombreDiaSemana(numero));
    }
}