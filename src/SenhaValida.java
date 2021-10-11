import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {

		int senhavalid = 1234;
		int senhainfo;
		boolean verifica = true;
		
		Scanner entrada = new Scanner(System.in);
		
		while (verifica == true) {
			System.out.println("Informe sua Senha númerica: ");
			senhainfo = entrada.nextInt();

			if (senhavalid != senhainfo) {
				verifica = true;
				System.out.println("Acesso Negado");
			} else {
				verifica = false;
				System.out.println("Acesso Permitido");
			}
			
		} entrada.close();

	}
}
