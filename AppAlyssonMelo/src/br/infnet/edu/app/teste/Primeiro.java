package br.infnet.edu.app.teste;

public class Primeiro {
	
	//static para o metodo main poder "enxergar"
	//private static int qtde;
	//Criando métodos fora da class main
	
	//A4 - criar method para args (tirar do main)
	
	private static String nome;
	private static String sobrenome;
	private static int idade;
	private static float salario;
	private static boolean javaDev;
	private static int meses;
	
	
	private static boolean validar(int quantidade){
		return quantidade == 6;
	}
	
	private static int calcularAnoNascimento(int idadeAtual){
		return 2022 - idadeAtual;
	}
	
	private static float calculoSalario(float salarioAtual, int mesesTrabalhados){
		return salarioAtual * mesesTrabalhados;
	}
	
	private static String obterSituacao(int mesesTrabalhados){
		String situacaoAtual = "Iniciante";
		if(mesesTrabalhados > 48){
			situacaoAtual = "Veterano";
		}
		return situacaoAtual;
	}
	
	private static String obterStatus(float salarioAtual){
		//Operador ternário
		String statusAtual = salarioAtual > 5000.0 ? "Estável" : "Instável";
		return statusAtual;
	}
	
	private static void tratarParametros(String[] args){
		nome = args[0];
		sobrenome = args[1];	
		idade = Integer.valueOf(args[2]);
		salario = Float.valueOf(args[3]);
		javaDev = Boolean.valueOf(args[4]);
		meses = Integer.valueOf(args[5]);
	}
	
	private static void imprimir(){
		int anoNascimento = calcularAnoNascimento(idade);
		float salarioTotal = calculoSalario(salario,meses);
		String situacao = obterSituacao(meses);
		//Operador ternário abaixo
		String status = obterStatus(salario);
		
		//Relatório
		System.out.println("Nome: " + nome);
		System.out.println(sobrenome);
		System.out.println(anoNascimento);
		System.out.println(salario);
		System.out.println("Salário total é igual a: R$" + salarioTotal);
		System.out.println("Situação: " + situacao);
		System.out.println("Status: " + status);
	}
	
	public static void main(String[] args){
		
		//quantidade de args para validação
		int qtde = args.length;
		
		boolean validado = validar(qtde);
		//int anoNascimento = calcularAnoNascimento(idade);
		
		if(validado){
			
			tratarParametros(args);
			imprimir();
			
		} 
		else{
			System.out.println(nome + ", Impossível exibir relatório, quantidade de variáveis igual a: "+ qtde);
		}
	};
};