package br.edu.infnet.app.dominio;

public class Dirigente extends Profissional {
	
	private int anoInicio;
	private boolean ehpresidente;
	private Contato contato;
	
	@Override
	public float calcularSalario() {
		int indicativoAno = 2023 - anoInicio;
		
		return indicativoAno -(ehpresidente ? 7500:0);
	}
	
	
	
	
	
	
	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}
	public boolean isEhpresidente() {
		return ehpresidente;
	}
	public void setEhpresidente(boolean ehpresidente) {
		this.ehpresidente = ehpresidente;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
	
	
	
	
	
	
}
