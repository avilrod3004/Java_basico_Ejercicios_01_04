package validaciones;

import java.util.Scanner;

public class ValidarEntrada {

    public static int entradaEntero(String mensaje, Scanner scanner) {
        int numero = -1;
        boolean entradaValida = false;

        do {
            System.out.print(mensaje);

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                entradaValida = true;
            } else {
                scanner.next();
                System.out.println("ERROR - El valor ingreado no es un número entero válido.\n");
            }
        } while (!entradaValida);

        return numero;
    }
}
