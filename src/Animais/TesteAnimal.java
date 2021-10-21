package Animais;

public class TesteAnimal {

	public static void main(String[] args) {

		Mamiferos m1 = new Mamiferos();

		m1.setEspecie("Cavalo");
		m1.Comunicar();
		m1.Mover();
		m1.setComida("Hérbivoro");
		m1.setReproducao("Uterina");

		Aves v1 = new Aves();

		v1.setEspecie("Falcão");
		v1.Comunicar();
		v1.Mover();
		v1.setComida("Carnivoro");
		v1.setReproducao("Ovos");

	}

}
