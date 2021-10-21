import java.util.Scanner;

public class NumPositivoNegativo {

	public static void main(String[] args) {

		int numeroinfo, totalinfo;
		totalinfo = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		numeroinfo = entrada.nextInt();
		do {
			System.out.println("Informe um número: ");
			totalinfo = totalinfo + numeroinfo;
			System.out.println("Número informado: " + numeroinfo + " Total dos números até aqui: " + totalinfo);
			numeroinfo = entrada.nextInt();
		} while (numeroinfo > 0);

		entrada.close();

	}

}
