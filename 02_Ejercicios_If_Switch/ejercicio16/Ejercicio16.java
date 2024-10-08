package ejercicios_02.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static int calcularProbabilidadInfidelidad() {
        int puntuacion = 0;
        try {

            File archivoPreguntas = new File("test_infidelidad.txt");
            Scanner lector = new Scanner(archivoPreguntas);
            String linea;


            while (lector.hasNextLine()) {
                linea = lector.nextLine();
                if (linea.contains("?")) {
                    System.out.println(linea);
                    Scanner respuestaScanner = new Scanner(System.in);
                    char respuesta = respuestaScanner.next().toUpperCase().charAt(0);
                    if (respuesta == 'V') {
                        puntuacion += 3;
                    }
                }
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo test_infidelidad.txt no fue encontrado.");
        }

        return Math.min(puntuacion, 12);
    }
}