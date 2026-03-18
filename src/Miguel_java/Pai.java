package Miguel_java;

public class Pai {
	
	private String nome;
	private int idade;
	
	public Pai (String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
	}
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getnidade() {
		return idade;
	}

	public void setnidade(int idade) {
		this.idade = idade;
	}

	public void exibirDados() {
		System.out.println("==DADOS DO ANIMAL==");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}

}
