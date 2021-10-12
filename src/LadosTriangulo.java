import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {

		int lado1, lado2, lado3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o tamanho do 1� lado: ");
		lado1 = entrada.nextInt();
		System.out.println("Informe o tamanho do 2� lado: ");
		lado2 = entrada.nextInt();
		System.out.println("Informe o tamanho do 3� lado: ");
		lado3 = entrada.nextInt();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Este Tri�ngulo � Equil�tero.");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Este Tri�ngulo � Escaleno.");
		} else {
			System.out.println("Este Tri�ngulo � Is�scele");
		}

		entrada.close();
	}

}
