import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {

		int lados;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o n�mero de lados: ");
		lados = entrada.nextInt();

		if (lados < 3) {
			System.out.println("N�o � um Pol�gono!");
		} else if (lados > 5) {
			System.out.println("Pol�gono n�o identificado.");
		} else {
			System.out.println("Os lados formam um Pol�gono.");
		}

		entrada.close();
	}

}
