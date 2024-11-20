import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double resultado;
        String repetir = "s";
        int operacion;

        do {
            Double primerNumero = null;
            Double segundoNumero = null;

            while (primerNumero == null) {
                try {
                    System.out.println("Introduce el primer número:");
                    primerNumero = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("Eso no es un número válido. Intenta de nuevo.");
                    scanner.next();
                }
            }

            while (segundoNumero == null) {
                try {
                    System.out.println("Introduce el segundo número:");
                    segundoNumero = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("Eso no es un número válido. Intenta de nuevo.");
                    scanner.next();
                }
            }

            System.out.println("Selecciona una operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División):");
            try {
                operacion = scanner.nextInt();
                if (operacion < 1 || operacion > 4) {
                    System.out.println("Error: Valor introducido no es correcto. Selecciona una operación válida.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Asegúrate de introducir un número para la operación.");
                scanner.next();
                continue;
            }

            try {
                if (operacion == 1) {
                    resultado = primerNumero + segundoNumero;
                    System.out.println("El resultado de sumar ambos números es: " + resultado);
                } else if (operacion == 2) {
                    resultado = primerNumero - segundoNumero;
                    System.out.println("El resultado de restar ambos números es: " + resultado);
                } else if (operacion == 3) {
                    resultado = primerNumero * segundoNumero;
                    System.out.println("El resultado de multiplicar ambos números es: " + resultado);
                } else if (operacion == 4) {
                    if (segundoNumero == 0) {
                        throw new ArithmeticException("Error: No se puede dividir por cero.");
                    }
                    resultado = primerNumero / segundoNumero;
                    System.out.println("El resultado de dividir ambos números es: " + resultado);
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

            System.out.println();
            System.out.println("¿Deseas repetir la operación? (s/n)");
            repetir = scanner.next();
            System.out.println();
        } while (repetir.equalsIgnoreCase("s"));

        System.out.println("Gracias por usar nuestro programa");
        scanner.close();
    }
}

