public class ExerciciosArray2 {

	public static void main(String[] args) {

		int i = 0;
		int p = 0;
		int x;

		int[] array2 = { 13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125 };
		int[] par = new int[8];
		int[] impar = new int[8];

		for (x = 0; x < array2.length - 1; x++) {
			if (array2[x] % 2 == 0) {
				par[p] = array2[x];
				p++;
			} else {
				impar[i] = array2[x];
				i++;
			}
		}
		for (int valor : par) {
			if (valor != 0)
				System.out.println("Os valores pares são: " + valor);
		}
		for (int valor2 : impar) {
			if (valor2 != 0)
				System.out.println("Os valores impares são: " + valor2 + " e sua multiplicação por *2 : " + valor2 * 2);
		}

	}
}
