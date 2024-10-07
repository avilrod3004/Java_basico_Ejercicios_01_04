import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.EjerciciosES;
public class EjerciciosESTest {

    @Test
    public void testMultiplicar() {
        assertEquals(20, EjerciciosES.multiplicar(4, 5), 0.001);
    }

    @Test
    public void testEurosAPesetas() {
        assertEquals(16638.6, EjerciciosES.eurosAPesetas(100), 0.1);
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(60.10, EjerciciosES.pesetasAEuros(10000), 0.01);
    }

    @Test
    public void testOperacionesBasicas() {
        String resultado = EjerciciosES.operacionesBasicas(10, 5);

        System.out.println(resultado);


        assertTrue(resultado.contains("Suma: 15,00"));
        assertTrue(resultado.contains("Resta: 5,00"));
        assertTrue(resultado.contains("Multiplicación: 50,00"));
        assertTrue(resultado.contains("División: 2,00"));
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, EjerciciosES.areaRectangulo(4, 5), 0.001);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, EjerciciosES.areaTriangulo(4, 5), 0.001);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(121, EjerciciosES.calcularTotalFactura(100), 0.001);
    }

    @Test
    public void testCalcularSalarioSemanal() {
        assertEquals(480, EjerciciosES.calcularSalarioSemanal(40), 0.001);
    }

    @Test
    public void testVolumenCono() {
        assertEquals(20.944, EjerciciosES.volumenCono(2, 5), 0.001);
    }

    @Test
    public void testMbAKb() {
        assertEquals(1024, EjerciciosES.mbAKb(1), 0.001);
    }

    @Test
    public void testKbAMb() {
        assertEquals(1, EjerciciosES.kbAMb(1024), 0.001);
    }

    @Test
    public void testCalcularPrecioFinal() { assertEquals(55.0, EjerciciosES.calcularPrecioFinal(100.00F, "reducido", "mitad"), 0.001); }

    @Test
    public void testCalcularNotaNecesaria() {
        assertEquals(9.5, EjerciciosES.calcularNotaNecesaria(7, 8.5), 0.01);
    }
}
