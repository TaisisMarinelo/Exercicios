import java.util.Scanner;

public class NumPositivoNegativo {

	public static void main(String[] args) {

		int numeroinfo, totalinfo;
		totalinfo = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		numeroinfo = entrada.nextInt();
		do {
			System.out.println("Informe um n�mero: ");
			totalinfo = totalinfo + numeroinfo;
			System.out.println("N�mero informado: " + numeroinfo + " Total dos n�meros at� aqui: " + totalinfo);
			numeroinfo = entrada.nextInt();
		} while (numeroinfo > 0);

		entrada.close();

	}

}
