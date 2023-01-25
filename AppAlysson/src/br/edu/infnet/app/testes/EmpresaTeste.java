package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Administrativo;
import br.edu.infnet.app.dominio.Empresa;
import br.edu.infnet.app.dominio.Funcionario;
import br.edu.infnet.app.dominio.Programador;
import br.edu.infnet.app.exceptions.FaturamentoInvalidoException;
import br.edu.infnet.app.exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) throws NomeIncompletoException {
		
		
		
		Administrativo a1 = new Administrativo();
		a1.setIdade(44);
		a1.setSalario(1000);
		a1.setBonus(200);
		a1.setDesconto(300);
		
		Administrativo a3 = new Administrativo("Elberth", 44, 1000, 200, 300);
		
		Programador p2 = new Programador("Aninha", 40, 2000, "Delphi", true);

		Programador p1 = new Programador("Huguinho", 20);
		p1.setDevFull(false);
		p1.setLinguagem("Java");
		p1.setSalario(1000);
		
		
		
		Funcionario[] empresaFunc; //inicializacao do vetor
		empresaFunc = new Funcionario[4]; //criação do vetor
		// ou
		// Funcionario[] empresaFunc = new Funcionario[4]
		empresaFunc[0] = a1;
		empresaFunc[1] = a3;
		empresaFunc[2] = p2;
		empresaFunc[3] = p1;
	
		
		
		try {
			Empresa emp1 = new Empresa();
			emp1.setNome("Infnet arroz com");
			emp1.setFuncionarios(empresaFunc);
			emp1.imprimir();
		} catch (NomeIncompletoException e) {
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		
		
		try {
			Empresa imperioSalgados = new Empresa();
			imperioSalgados.setNome("Instituto Alysson Java");
			imperioSalgados.setFaturamento(-2000);
			imperioSalgados.imprimir();
		} catch (NomeIncompletoException | FaturamentoInvalidoException e) { //criar duas excessões juntas
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		Empresa teste1 = new Empresa();
		teste1.setNome("Instituto Infnet JAVA");
		
		
		//Criando empresa com nome e uma sem nome
		
		
		try {
			Empresa zezinho = new Empresa();
			zezinho.setNome("Instituto");
			zezinho.imprimir();
		} catch (NomeIncompletoException e) {
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		
		try {
			Empresa semNome = new Empresa();
			semNome.imprimir();
		} catch (NomeIncompletoException e) {
			System.out.println("[ERROR]" + e.getMessage());
			System.out.println("Error 2" + e.getCause());//Tratamento de erro com [ERROR] e.getMessage()
		}
		
		
		
		
		
		

	}

}
