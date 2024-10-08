package ejercicios_02.ejercicio17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio17Test {

    @ParameterizedTest
    @ValueSource(ints = {123, 456, 789, 1000})
    void testObtenerUltimaCifra(int numero) {
        assertEquals(numero % 10, EjerciciosSwitch.obtenerUltimaCifra(numero));
    }
}