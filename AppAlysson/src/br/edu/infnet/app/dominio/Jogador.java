package br.edu.infnet.app.dominio;

public class Jogador extends Profissional {

	private int anoNascimento;
	private int tituloNacional;
	private int tituloInternacional;
	
	@Override //method abastract da classe mãe
	
	public float calcularSalario() {
		float indicadorNacional = this.tituloNacional * 1000;
		float indicadorInter = this.tituloInternacional * 5000;
		
		
		return indicadorNacional + indicadorInter;
	}
	
	
	
	public Jogador(){
	}
	
	public Jogador(String name, int ano, int nacionais, int internacionais){
		this.anoNascimento = ano;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getTituloNacional() {
		return tituloNacional;
	}
	public void setTituloNacional(int tituloNacional) {
		this.tituloNacional = tituloNacional;
	}
	public int getTituloInternacional() {
		return tituloInternacional;
	}
	public void setTituloInternacional(int tituloInternacional) {
		this.tituloInternacional = tituloInternacional;
	}

	
	

	
}
