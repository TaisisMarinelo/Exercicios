import java.util.Scanner;

public class LetraLetra {

	public static void main(String[] args) {

		String palavra;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe uma palavra: ");
		palavra = entrada.next();

		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}

		entrada.close();
	}

}
