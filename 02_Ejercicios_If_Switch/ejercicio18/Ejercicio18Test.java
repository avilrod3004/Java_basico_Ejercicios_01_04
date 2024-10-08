package ejercicios_02.ejercicio18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio18Test {

    @ParameterizedTest
    @CsvSource({
            "12345, 1",
            "67890, 6",
            "9, 9"
    })
    void testObtenerPrimeraCifra(int numero, int expectedPrimeraCifra) {
        assertEquals(expectedPrimeraCifra, EjerciciosSwitch.obtenerPrimeraCifra(numero));
    }

}