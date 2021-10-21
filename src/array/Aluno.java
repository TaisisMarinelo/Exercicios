package array;

public class Aluno {

	private String nome;
	private double[] notas;

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public void Saida() {
		System.out.println("Aluno nome: " + getNome());
		System.out.println("Sua maior nota, foi : " + maiorNota());
		System.out.println("Sua media foi : " + Media());
		System.out.println("E ele está : " + Aprovado());
	}

	public double Media() {
		double total = 0;
		for (double nota : getNotas()) {
			total = total + nota;

		}
		return total/notas.length;
	}

	public double maiorNota() {
		double maiorNota = 0;
		for (double nota : getNotas()) {
			if (nota > maiorNota) {
				maiorNota = nota;
			}
		}
		return maiorNota;
	}

	public String Aprovado() {
		if (Media() > 7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}	
	