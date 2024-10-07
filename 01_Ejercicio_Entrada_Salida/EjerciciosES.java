package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjerciciosES {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Pedir dos números y mostrar el resultado de su multiplicación
        System.out.println("Ejercicio 1: Multiplicación de dos números");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));

        // Ejercicio 2: Conversor de euros a pesetas
        System.out.println("\nEjercicio 2: Conversor de euros a pesetas");
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();
        System.out.println(euros + " euros son " + eurosAPesetas(euros) + " pesetas.");

        // Ejercicio 3: Conversor de pesetas a euros
        System.out.println("\nEjercicio 3: Conversor de pesetas a euros");
        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();
        System.out.println(pesetas + " pesetas son " + pesetasAEuros(pesetas) + " euros.");

        // Ejercicio 4: Operaciones básicas con dos números
        System.out.println("\nEjercicio 4: Suma, resta, multiplicación y división de dos números");
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("Resultados:\n" + operacionesBasicas(num1, num2));

        // Ejercicio 5: Cálculo del área de un rectángulo
        System.out.println("\nEjercicio 5: Cálculo del área de un rectángulo");
        System.out.print("Introduce el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Introduce el largo del rectángulo: ");
        double largo = scanner.nextDouble();
        System.out.println("El área del rectángulo es: " + areaRectangulo(ancho, largo));

        // Ejercicio 6: Cálculo del área de un triángulo
        System.out.println("\nEjercicio 6: Cálculo del área de un triángulo");
        System.out.print("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();
        System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));

        // Ejercicio 7: Calcular el total de una factura a partir de la base imponible
        System.out.println("\nEjercicio 7: Calcular el total de una factura con IVA");
        System.out.print("Introduce la base imponible de la factura: ");
        double baseFactura = scanner.nextDouble();
        System.out.println("El total de la factura con IVA es: " + calcularTotalFactura(baseFactura));

        // Ejercicio 8: Calcular el salario semanal de un empleado en base a las horas trabajadas, 12€/h
        System.out.println("Ejercicio 8: Calcular salario semanal");
        System.out.print("Horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Salario semanal: " + calcularSalarioSemanal(horasTrabajadas));

        // Ejercicio 9: Calcular el volumen de un cono
        System.out.println("\nEjercicio 9: Calcular el volumen de un cono");
        System.out.print("Radio del cono: ");
        float radio = scanner.nextFloat();
        System.out.print("Altura del cono: ");
        float alturaCono = scanner.nextFloat();
        System.out.println("El volumen del cono es: " + volumenCono(radio, alturaCono));

        // Ejercicio 10: Conversor de MB a KB
        System.out.println("Ejercicio 10: Convertir de MB a KB");
        System.out.print("MB: ");
        float mb = scanner.nextFloat();
        System.out.println("Son " + mbAKb(mb) + "KB");

        // Ejercicio 11: Conversor de KB a MB
        System.out.println("Ejercicio 11: Convertir de KB a MB");
        System.out.print("KB: ");
        float kb = scanner.nextFloat();
        System.out.println("Son " + kbAMb(kb) + "MB");

        // Ejercicio 12: Calcular el precio final de un producto según su base imponible,
        // el tipo de IVA y el código promocional
        System.out.println("Ejercicios 13: Calcular el precio final de un producto.");
        System.out.print("Introduzca la base imponible: ");
        float baseImponible = scanner.nextFloat();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = scanner.next();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5 porc): ");
        String codigoPromo = scanner.next();
        System.out.println(calcularPrecioFinal(baseImponible, tipoIVA, codigoPromo));

        // Ejercicio 13: Calcular la nota necesaria para el segundo examen
        System.out.println("Ejercicio 13: Calcular la nota del segundo examen, según la media");
        System.out.print("Introduce la nota del primer examen: ");
        float primerExamen = scanner.nextFloat();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        float notaTrimestre = scanner.nextFloat();
        System.out.println("Para tener un " + notaTrimestre + " en el trimestre necesitas sacar un " + calcularNotaNecesaria(primerExamen, notaTrimestre) + " en el segunda examen.");

        scanner.close();
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static double eurosAPesetas(double euros) {
        return euros * 166.386;
    }

    public static double pesetasAEuros(double pesetas) {
        return pesetas / 166.386;
    }

    public static String operacionesBasicas(int x, int y) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(String.format("Suma: %.2f%n", (double) (x + y)));
        resultado.append(String.format("Resta: %.2f%n", (double) (x - y)));
        resultado.append(String.format("Multiplicación: %.2f%n", (double) (x * y)));
        resultado.append(String.format("División: %.2f%n", x / (double) y));


        return resultado.toString().trim(); // Eliminar espacios en blanco al final
    }

    public static double areaRectangulo(double ancho, double largo) {
        return ancho * largo;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularTotalFactura(double base) {
        return base * 1.21; // IVA del 21%
    }

    public static double calcularSalarioSemanal(int horas) { return horas * 12; }

    public static double volumenCono(float radio, float altura) { return ((double) 1 / 3) * Math.PI * (radio * radio) * altura; }

    public static double mbAKb(float mb) { return mb * 1024; }

    public static double kbAMb(float kb) { return kb / 1024; }

    public static float calcularPrecioFinal(float baseImponible, String tipoIVA, String codigoPromo) {
        System.out.println("Base imponible");
        System.out.println(baseImponible);

        int ivaPorcentaje = obtenerIVA(tipoIVA);
        System.out.print("IVA (" + ivaPorcentaje + "%) ");
        float iva = calcularIVA(baseImponible, ivaPorcentaje);
        System.out.println(iva);

        float baseConIVA = sumarIVA(baseImponible, iva);
        System.out.println("Precio con IVA " + baseConIVA + "\n");
        System.out.println(baseConIVA);

        float descuento = calcularPromocion(baseConIVA, codigoPromo);
        System.out.println("Cód. promo. (" + codigoPromo + "): -" + descuento + "\n");

        System.out.println("TOTAL");

        return restarDescuento(baseConIVA, descuento);
    }

    private static String pedirTipoIVA() {
        boolean tipoValido = false;
        String tipoIVA;
        List<String> tiposIVA = Arrays.asList("general", "reducido", "superreducido");

        do {
            Scanner entradaIVA = new Scanner(System.in);
            System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
            tipoIVA = entradaIVA.nextLine();

            if (tiposIVA.contains(tipoIVA)) {
                tipoValido = true;
            }
        } while (!tipoValido);

        return tipoIVA;

    }

    private static int obtenerIVA(String tipoIVA) {
        return switch (tipoIVA) {
            case "general" -> 21;
            case "reducido" -> 10;
            case "superreducido" -> 4;
            default -> 0;
        };
    }

    private static float calcularIVA (float baseImponible, int iva) {
        return (baseImponible * iva) / 100;
    }

    private static float sumarIVA(float baseImponible, float parteIVA) {
        return baseImponible + parteIVA;
    }

    private static String pedirCodPromocion() {
        boolean codPromocionValido = false;
        String codPromocion;
        List<String> codigosPromo = Arrays.asList("nopro", "mitad", "meno5", "5porc");

        do {
            Scanner entradaCodPromo = new Scanner(System.in);
            System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            codPromocion = entradaCodPromo.nextLine();

            if (codigosPromo.contains(codPromocion)) {
                codPromocionValido = true;
            }
        } while (!codPromocionValido);

        return codPromocion;
    }

    private static float calcularPromocion(float baseConIVA, String codPromocion) {

        return switch (codPromocion) {
            case "mitad" -> baseConIVA / 2;
            case "meno5" -> baseConIVA - 5;
            case "5porc" -> (baseConIVA * 5) / 100;
            default -> 0;
        };
    }

    private static float restarDescuento(float baseConIVA, float descuento) {
        return baseConIVA - descuento;
    }

    public static double calcularNotaNecesaria(float primerExamen, double notaTrimestre) {
        return (notaTrimestre - (0.4 * primerExamen)) / 0.6;
    }
}
