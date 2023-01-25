package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Estagiario;

public class EstagiarioTeste {

	public static void main(String[] args) {
		
		Estagiario e1 = new Estagiario();
		e1.setNome("Alysson");
		e1.setIdade(35);
		e1.setFaculdade("INFNET");
		e1.setPeriodo(2);
		e1.setSalario(4560);
		e1.imprimir();
		
		
		
		

	}

}
