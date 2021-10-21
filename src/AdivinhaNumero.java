import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	public static void main(String[] args) {

		int numeroinfo;
		int numeroAleatorio;

		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		numeroAleatorio = gerador.nextInt(101);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Qual número entre 0 e 10, você acha que pode ter saído? ");
			numeroinfo = entrada.nextInt();

			if (numeroinfo == numeroAleatorio) {
				System.out.println("Parabéns você acertou! ");
				i += 10;
			} else {
				System.out.println("Que pena você errou, ainda tem " + (10 - i) + " tentativas!");
			}

		}

		entrada.close();

	}

}
