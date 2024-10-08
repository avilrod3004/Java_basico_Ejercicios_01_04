package ejercicios_04.ejercicio15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    public void testEjercicio15() {
        String melodia = Ejercicio15.ejercicio15();
        assertNotNull(melodia);
        assertTrue(melodia.endsWith("||"));
        // Verificar que la última nota coincide con la primera
        String[] partes = melodia.split(" \\| | \\|\\|");
        String primeraNota = partes[0].split(" ")[0];
        String ultimaNota = partes[partes.length - 1].split(" ")[partes[partes.length - 1].split(" ").length - 1];
        assertEquals(primeraNota, ultimaNota);
    }
}