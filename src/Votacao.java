
public class Votacao {

	public static void main(String[] args) {
		
		int anonascimento = 2003;
		int ano = 2021;
		int idade;
				
		
		idade = ano - anonascimento;
		
		if (idade < 18) {
			System.out.println("Você não pode votar!");
		}else {
			System.out.println("Você pode votar!");
		}

	}

}
