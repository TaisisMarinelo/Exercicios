public class MaiorMenor {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 8;
		int n3 = 4;

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior valor e: " + n1);
		} else if (n2 > n3) {
			System.out.println("O maior valor e: " + n2);
		} else {
			System.out.println("O maior valor e: " + n3);

		}

		if (n1 < n2 && n1 < n3) {
			System.out.println("O menor valor e: " + n1);
		} else if (n2 < n3) {
			System.out.println("O menor valor e: " + n2);
		} else {
			System.out.println("O menor valor e: " + n3);
		}

	}

}
