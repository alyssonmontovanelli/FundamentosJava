package br.edu.infnet.app.dominio;

public abstract class Profissional {
	
	private String nome;

	public abstract float calcularSalario();
	
	//public Profissional(String name){
	//	this.nome = name;
	//}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
