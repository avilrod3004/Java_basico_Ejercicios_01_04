package ejercicios_02.ejercicio4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @ParameterizedTest
    @CsvSource({
            "35, 420",
            "40, 480",
            "45, 560"
    })
    void testCalcularSalarioSemanal(int horas, double expectedSalario) {
        assertEquals(expectedSalario, Ejercicio4.calcularSalarioSemanal(horas), 0.01);
    }
}