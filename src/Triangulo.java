import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		int angulo1, angulo2, angulo3, totalangulo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor do 1� angulo: ");
		angulo1 = entrada.nextInt();

		System.out.println("Informe o valor do 2� angulo: ");
		angulo2 = entrada.nextInt();

		System.out.println("Informe o valor do 3� angulo: ");
		angulo3 = entrada.nextInt();

		totalangulo = angulo1 + angulo2 + angulo3;

		if (totalangulo == 180) {
			if (angulo1 > 90 || angulo2 > 90) {
				System.out.println("� um Tri�ngulo Obtuso");
			} else if (angulo3 > 90) {
				System.out.println("� um Tri�ngulo Obtuso");
			} else if (angulo1 == 90 || angulo2 == 90) {
				System.out.println("� um Tri�ngulo reto");
			} else if (angulo3 == 90) {
				System.out.println("� um Tri�ngulo reto");
			} else {
				System.out.println("� um Tri�ngulo agudo");
			}
		} else {
			System.out.println("Os angulos informados n�o formam um triangulo!");
		}

		entrada.close();
	}

}
