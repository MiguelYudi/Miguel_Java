package Miguel_java;

public class moto extends veiculo {
	

	private int cilindradas;

	public moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	@Override //indica que o método esta sendo sobreescrito 
	public void exibirDados() {
	super.exibirDados();
		System.out.println("cilindradas: "+cilindradas);
				
	}
	}
	
	
}
