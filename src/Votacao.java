
public class Votacao {

	public static void main(String[] args) {
		
		int anonascimento = 2003;
		int ano = 2021;
		int idade;
				
		
		idade = ano - anonascimento;
		
		if (idade < 18) {
			System.out.println("Voc� n�o pode votar!");
		}else {
			System.out.println("Voc� pode votar!");
		}

	}

}
