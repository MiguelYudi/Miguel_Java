package Exercicios;

public class PessoaHeranca  extends Pessoa {

	    private String curso;

	    public PessoaHeranca(String nome, String curso) {
	        super(nome); 
	        this.curso = curso;
	    }

	    @Override
	    public void apresentar() {
	        System.out.println("Sou aluno do curso de " + curso);
	    }
	}

	class Professor extends Pessoa {
	    private String disciplina;

	    public Professor(String nome, String disciplina) {
	        super(nome);
	        this.disciplina = disciplina;
	    }

	    @Override
	    public void apresentar() {
	        System.out.println("Sou professor de " + disciplina);
	    }
	}

