package br.edu.infnet.app.dominio;

import br.edu.infnet.app.exceptions.FaturamentoInvalidoException;
import br.edu.infnet.app.exceptions.NomeIncompletoException;

public class Empresa {
	
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private float faturamento;
	
	
	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) throws FaturamentoInvalidoException {
		
		if(faturamento < 0){
			throw new FaturamentoInvalidoException("Faturamento não aceita valor negativo.");
		}
		
		this.faturamento = faturamento;
	}
	private Funcionario[] funcionarios; // criando relação de 1 pra 1
	
	//impressão
	@Override
	public String toString() {
		return nome + " / " + sobrenome + " / " + ultimoNome + " / " + faturamento;
	}
	
	private float calculoFolhaSalarial(){
		//forEach na classe mãe "Funcionarios" para pegar o method e calcular soma dos salários
		float folhaSalarial = 0;
		if(funcionarios != null){
			for(Funcionario func : funcionarios){
				folhaSalarial = folhaSalarial + func.calcularSalarioLiquido();
			}
		}
		return folhaSalarial;
	}
	
	private int quantidadeFuncionarios(){
		return funcionarios != null ? funcionarios.length : 0;
	}
	
	private void impressaoFuncionario(){
		if(funcionarios !=null){
			for (Funcionario func : funcionarios) {
				System.out.printf("Nome: %s; Idade: %d; Salário: %.2f\n", //Method printf modelagem de relatório
						func.getNome(),
						func.getIdade(),
						func.getSalario());
			}
		}
	}
	
	
	public void imprimir() throws NomeIncompletoException{
		System.out.println("Empresa: " + getNome());
		System.out.println("Número de funcionários: " +  quantidadeFuncionarios());
		System.out.println("Folha salarial da empresa: R$ " + calculoFolhaSalarial());
		System.out.println("Faturamento da empresa é de: R$ " + faturamento);
		impressaoFuncionario();
	}
	
	//getters - setters 
	public String getNome() throws NomeIncompletoException { //Adicionando excessão 
		
		if(nome == null || sobrenome == null || ultimoNome == null){
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto");
		}
			StringBuilder sb = new StringBuilder();
			sb.append(ultimoNome.toUpperCase().charAt(0));
			sb.append(".");
			sb.append(",");
			sb.append(" ");
			sb.append(nome.toUpperCase());
			sb.append(" ");
			sb.append(sobrenome.toLowerCase());
			sb.append(".");		
			return sb.toString();
		
	}
	public void setNome(String nome) throws NomeIncompletoException {
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.indexOf(" ");
		
		if(posInicial < 0 || posFinal < 0){
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto");
		}
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Empresa(){	
	}
		
	
	
	
	
	
}
