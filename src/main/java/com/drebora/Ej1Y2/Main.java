package com.drebora.Ej1Y2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Primer valor: ");
            double primerValor = scanner.nextInt();

            System.out.print("Segundo valor: ");
            double segundoValor = scanner.nextInt();

            System.out.print("Operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;

            try {
                switch (operacion) {
                    case '+':
                        resultado = Calculadora.suma(primerValor, segundoValor);
                        break;
                    case '-':
                        resultado = Calculadora.resta(primerValor, segundoValor);
                        break;
                    case '*':
                        resultado = Calculadora.multiplicacion(primerValor, segundoValor);
                        break;
                    case '/':
                        resultado = Calculadora.division(primerValor, segundoValor);
                        break;
                    default:
                        System.out.println("Operación no válida");
                        continue;
                }

                System.out.println("Resultado: " + resultado);

                if (resultado < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo!");
                } else if (resultado > 10000) {
                    System.out.println("Error, resultado muy grande");
                } else {
                    System.out.println("Resultado dentro de los límites");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}