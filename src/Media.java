import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		float n1, n2, n3, media;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe sua 1ª nota: ");
		n1 = entrada.nextFloat();

		System.out.println("Informe sua 2ª nota: ");
		n2 = entrada.nextFloat();

		System.out.println("Informe sua 3ª nota: ");
		n3 = entrada.nextFloat();

		media = (n1 + n2 + n3) / 3;

		if (media == 10.0) {
			System.out.println("Aprovado com Distinção!");
		} else if (media >= 7.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}

		entrada.close();

	}

}
