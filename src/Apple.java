import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		int maca;
		double preconormal, precodesconto, valortotal;

		preconormal = 0.30;
		precodesconto = 0.25;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de Maças: ");
		maca = entrada.nextInt();

		if (maca < 12) {
			valortotal = maca * preconormal;
			System.out.print("Você vai levar, " + maca);
			System.out.printf(" maçãs a R$ %.2f %n", (valortotal));
		} else {
			valortotal = maca * precodesconto;
			System.out.print("Você vai levar, " + maca);
			System.out.printf(" maçãs a R$ %.2f %n", (valortotal));
		}

		entrada.close();

	}

}
