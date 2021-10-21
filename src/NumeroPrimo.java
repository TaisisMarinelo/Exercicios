import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		int numero, i, x;
		boolean primo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número intero: ");
		numero = entrada.nextInt();

		for (i = 2; i <= numero; i++) {
			primo = true;
			for (x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
				}
			}

			if (numero == i && primo == true) {
				System.out.println("O número, " + numero + " é primo.");
			} else if (numero == i && primo == false) {
				System.out.println("O número, " + numero + " não é primo.");
			}
		}

		entrada.close();
	}
}