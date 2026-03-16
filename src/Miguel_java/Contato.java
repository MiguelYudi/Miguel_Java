package Miguel_java;

import java.util.ArrayList;

public class Contato {
	
private String nome;
private String telefone;


private ArrayList<Contato> contatos = new ArrayList<>();

public Contato(String nome,String telefone) {
	this.nome = nome;
	this.telefone = telefone;

}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public ArrayList<Contato> getContatos() {
	return contatos;
}

public void setContatos(ArrayList<Contato> contatos) {
	this.contatos = contatos;
}








}
	


