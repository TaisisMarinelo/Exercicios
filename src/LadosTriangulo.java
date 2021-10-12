import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {

		int lado1, lado2, lado3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o tamanho do 1º lado: ");
		lado1 = entrada.nextInt();
		System.out.println("Informe o tamanho do 2º lado: ");
		lado2 = entrada.nextInt();
		System.out.println("Informe o tamanho do 3º lado: ");
		lado3 = entrada.nextInt();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Este Triângulo é Equilátero.");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Este Triângulo é Escaleno.");
		} else {
			System.out.println("Este Triângulo é Isóscele");
		}

		entrada.close();
	}

}
