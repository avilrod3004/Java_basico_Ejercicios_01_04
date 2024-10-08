package ejercicios_04.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio02Test {

    private Ejercicio02 ejercicios;

    @BeforeEach
    public void setUp() {
        ejercicios = new EjerciciosAleatorios();
    }

    @Test
    public void testEjercicio2() {
        String carta = ejercicios.ejercicio2();
        assertNotNull(carta);
        assertFalse(carta.isEmpty());
        assertTrue(carta.matches("([2-9]|10|J|Q|K|A) de (Picas|Corazones|Diamantes|Tréboles)"));
    }

}