import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		int numero, i, x;
		boolean primo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero intero: ");
		numero = entrada.nextInt();

		for (i = 2; i <= numero; i++) {
			primo = true;
			for (x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
				}
			}

			if (numero == i && primo == true) {
				System.out.println("O n�mero, " + numero + " � primo.");
			} else if (numero == i && primo == false) {
				System.out.println("O n�mero, " + numero + " n�o � primo.");
			}
		}

		entrada.close();
	}
}