package org.cuatrovientos.dam.entornos.calculadora;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la calculadora.
 */
public class Main {

    public static void main(String[] args) {
        // Variables necesarias para la calculadora
        Scanner scanner = new Scanner(System.in);
        double resultado = Double.NaN; // Inicializo a NaN para evitar errores

        // Inicio del programa
        System.out.println("===================================");
        System.out.println("            Calculadora            ");
        System.out.println("===================================");
        System.out.println("Introduce 2 números y una operación");

        // Pedir los numeros
        System.out.print("Dime el numero 1: ");
        double operando1 = scanner.nextDouble();
        System.out.print("Dime el numero 2: ");
        double operando2 = scanner.nextDouble();

        // Mostrar opciones de operación
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("¿Qué operación quieres realizar?: ");
        int opcion = scanner.nextInt();

        // Evaluar la operación y calcular el resultado
        switch (opcion) {
            case 1:
                resultado = operando1 + operando2;
                break;
            case 2:
                resultado = operando1 - operando2;
                break;
            case 3:
                resultado = operando1 * operando2;
                break;
            case 4:
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        // Mostrar el resultado si la operación fue válida
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

		scanner.close();
	}
}
