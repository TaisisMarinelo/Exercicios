import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {

		int lados;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número de lados: ");
		lados = entrada.nextInt();

		if (lados < 3) {
			System.out.println("Não é um Polígono!");
		} else if (lados > 5) {
			System.out.println("Polígono não identificado.");
		} else {
			System.out.println("Os lados formam um Polígono.");
		}

		entrada.close();
	}

}
