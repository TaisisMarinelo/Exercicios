import java.util.Scanner;

public class PesquisaPrefeitura {

	public static void main(String[] args) {

		double salario = 0.00;
		double salariototal = 0.00;
		double maiorsalario = 0.00;
		int salariobaixo = 0;
		int filhos = 0;
		int filhostotal = 0;
		int amostra = 20;

		Scanner entrada = new Scanner(System.in);
		int j = 1;
		for (int i = 1; i <= amostra; i++) {
			System.out.println("Informe o Salario do Habitante " + j + " :");
			salario = entrada.nextDouble();
			j++;
			if (salario > maiorsalario) {
				maiorsalario = salario;
			}
			if (salario <= 100.00) {
				salariobaixo++;
			}
			salariototal += salario;
			System.out.println("Informe o total de filhos: ");
			filhos = entrada.nextInt();
			filhostotal += filhos;

		}

		System.out.printf("A média salarial é: %.2f \n", +(salariototal / amostra));
		System.out.println("A media de filhos é: " + (filhostotal / amostra));
		System.out.println("O maior Salario é: " + maiorsalario);
		System.out.println("O percentual de Pessoas com salarios até R$100,00.: " + (100 * salariobaixo / amostra));

		entrada.close();
	}

}
