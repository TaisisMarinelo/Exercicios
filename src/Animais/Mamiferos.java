package Animais;

public class Mamiferos extends Animal {

	@Override
	public void Comunicar() {
		System.out.println("Som proveniente da laringe ... ");
	}

	@Override
	public void Mover() {
		System.out.println("Pode se mover de acordo com sua Fauna, andar, pular, nadar...");
	}

}
