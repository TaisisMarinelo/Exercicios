package Animais;

public class Aves extends Animal {

	@Override
	public void Comunicar() {
		System.out.println("Canto...");
	}

	@Override
	public void Mover() {
		System.out.println("Voar...");
	}

}
