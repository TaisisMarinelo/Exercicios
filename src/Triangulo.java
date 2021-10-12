import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		int angulo1, angulo2, angulo3, totalangulo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor do 1º angulo: ");
		angulo1 = entrada.nextInt();

		System.out.println("Informe o valor do 2º angulo: ");
		angulo2 = entrada.nextInt();

		System.out.println("Informe o valor do 3º angulo: ");
		angulo3 = entrada.nextInt();

		totalangulo = angulo1 + angulo2 + angulo3;

		if (totalangulo == 180) {
			if (angulo1 > 90 || angulo2 > 90) {
				System.out.println("É um Triângulo Obtuso");
			} else if (angulo3 > 90) {
				System.out.println("É um Triângulo Obtuso");
			} else if (angulo1 == 90 || angulo2 == 90) {
				System.out.println("É um Triângulo reto");
			} else if (angulo3 == 90) {
				System.out.println("É um Triângulo reto");
			} else {
				System.out.println("É um Triângulo agudo");
			}
		} else {
			System.out.println("Os angulos informados não formam um triangulo!");
		}

		entrada.close();
	}

}
