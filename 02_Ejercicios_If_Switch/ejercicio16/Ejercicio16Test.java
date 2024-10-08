package ejercicios_02.ejercicio16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio16Test {

    @Test
    void testCalcularProbabilidadInfidelidad() {
        // Este test dependerá de cómo implementes el cálculo
        assertTrue(EjerciciosSwitch.calcularProbabilidadInfidelidad() >= 0 && EjerciciosSwitch.calcularProbabilidadInfidelidad() <= 100);
    }
}