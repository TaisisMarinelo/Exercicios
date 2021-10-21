import java.util.Scanner;

public class ImprimeValor {

	public static void main(String[] args) {

		int valor, maiorvalor;

		Scanner entrada = new Scanner(System.in);

		int n = 0;
		maiorvalor = 0;
		do {
			System.out.println("Informe um número: ");
			valor = entrada.nextInt();
			if (maiorvalor < valor) {
				maiorvalor = valor;
			}
			n++;
		} while (n < 10);
		System.out.println("O maior valor é: " + maiorvalor);
		entrada.close();

	}

}
