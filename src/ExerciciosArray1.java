public class ExerciciosArray1 {

	public static void main(String[] args) {
		
		int total = 0;
		int maior = 0;
		int menor;
		int []array= {87,68,94,100,83,78,85,91,76,87};
		
		menor = array[0];
		for(int numb : array) {
			total = total + numb;
			if (numb > maior) {
				maior = numb;
			}else if(numb < menor) {
				menor = numb;
			}
		}
		
		System.out.println("Valor total das somas dos elementos: "+total);
		System.out.println("Média dos elementos: " +total/array.length);
		System.out.println("O maior valor é: " +maior+ " e o menor valor é: " +menor);
		
	}	

}
