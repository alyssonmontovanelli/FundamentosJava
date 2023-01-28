package br.edu.infnet.app.dominio;

public class ComissaoTecnica extends Profissional {

	private boolean ehtreinador;
	private int qtdeTitulos;
	
	@Override
	public float calcularSalario() {
		float indicativo1 = this.qtdeTitulos * 2000;
		return indicativo1 + (ehtreinador ? 10000:0);
	}
	
	
	public boolean isEhtreinador() {
		return ehtreinador;
	}
	public void setEhtreinador(boolean ehtreinador) {
		this.ehtreinador = ehtreinador;
	}
	public int getQtdeTitulos() {
		return qtdeTitulos;
	}
	public void setQtdeTitulos(int qtdeTitulos) {
		this.qtdeTitulos = qtdeTitulos;
	}
	
	
	
}
