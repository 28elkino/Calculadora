import java.util.Scanner;

public class Calculadora {

	private static final Double Double = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double primerNumero = null;
		Double segundoNumero = null;
		Double resultado;

		while (primerNumero == (Double) null) {
			try {
				System.out.println("Introduce el primer número:");
				primerNumero = scanner.nextDouble();

			} catch (Exception e) {
				System.out.println("Eso no es un número válido. Intenta de nuevo.");
				scanner.next();
			}
		}

		System.out.println();
		while (segundoNumero == (Double) null) {
			try {
				System.out.println("Introduce el segundo número:");
				segundoNumero = scanner.nextDouble();
			} catch (Exception e) {
				System.out.println("Eso no es un número válido. Intenta de nuevo.");
				scanner.next();
			}
		}

		System.out.println();
		System.out.println("Indica que operación deseas realizar (1.sumar, 2.restar, 3.multiplicar, 4.dividir)");
		int operacion = scanner.nextInt();
		
		if (operacion = 1) {
			primerNumero + segundoNumero = Double resultado;
			System.out.println("El resultado de sumar ambos número es de:" + resultado);
		} else {

		}

		scanner.close();
	}

}
