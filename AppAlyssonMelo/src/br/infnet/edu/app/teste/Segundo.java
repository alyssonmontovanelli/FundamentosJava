package br.infnet.edu.app.teste;

import java.util.Scanner;

public class Segundo{
	
	// ESTRUTURA DE REPETIÇÃO
	
	public static void main(String[] args){
		
		// Utilizando scanner para coletar informações do usuário
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = in.next();
		System.out.print("Informe sua idade: ");
		int idade = in.nextInt();
		System.out.print("Informe seu salário: ");
		float salario = in.nextFloat();

		
		
		//forEach
		//for( tipoColecao obj : nomeColecao)
		System.out.println("#forEach");
		for(String n : args){
			System.out.println(n);
		}
		
		
		//for( inicializacao ; condicao ; incremento)
		System.out.println("#for tradicional");
		for(int i = 0 ; i < args.length ; i++){
			System.out.println(args[i]);
		}	
		
		
		//while
		System.out.println("#while");
		int a = 0;
		while(a < args.length){
			System.out.println(args[a]);
			a++;
		}
		
		//dowhile
		System.out.println("#dowhile");
		int b = 0;
		do {
			//incremento 
			System.out.println(args[b]);
			b++;
		}while(b < args.length);
	}
}