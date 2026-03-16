package Miguel_java;

import java.util.ArrayList;

public class Projetos_Array {
	private String nome;
	private double preco;
	private int quantidade;

	private ArrayList<Projetos_Array> lista = new ArrayList<>();
	
	public Projetos_Array() {
		
	}

	public Projetos_Array(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void exibirDados() {
		if(lista.isEmpty()) {
			System.out.println("Nenhum produto cadastrado");
			return;
		}
		System.out.println("==Lista de Produtos==");
		for(Projetos_Array total: lista) {
			System.out.println(total);
		}
	System.out.println("\nTotal: "+lista.size()+"Produtos");
}

public void adicionar(String nome, double preco, int quantidade) {
	Projetos_Array novoProduto = new Projetos_Array (nome,preco,quantidade);
	lista.add(novoProduto);
	
	
	
	
	
	
}
}
	