package Miguel_java;

public class carro extends veiculo {
	
	private int quantidadedeportas;

	public carro(String marca, String modelo, int ano, int quantidadedeportas) {
		super(marca, modelo, ano);
		//this.quantidadedeportas = quantidadedeportas;	
	}

	public int getQuantidadedeportas() {
		return quantidadedeportas;
	}

	public void setQuantidadedeportas(int quantidadedeportas) {
		this.quantidadedeportas = quantidadedeportas;
	}

	@Override
	public void exibirDados() {
	super.exibirDados();
	System.out.println("Quantidade: "+quantidadedeportas);
	}
	
	
	

}
