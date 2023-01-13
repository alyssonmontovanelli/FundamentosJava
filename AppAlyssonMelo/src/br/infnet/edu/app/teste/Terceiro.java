package br.infnet.edu.app.teste;

import java.util.Arrays;
import java.util.Scanner;

public class Terceiro {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	
	//method para imprimir com condicional de não nulo
	private static void imprimir(){
		
		for(int b = 0; b < nomes.length ; b++){
			if(nomes[b] != null)
			System.out.println(nomes[b] + idades[b] + salarios[b]);
		}
		
	//	for(String nome : nomes){
	//		if(nome != null){
	//			System.out.println("- " + nome);
	//		}
	//	}
	}

	public static void main(String[] args) {
//		Criando Array para receber os nomes;
		// constante é definida como FINAL e deve ser escrtia com letras maiúsculas
		final int TAMANHO = 5;		
		
		//criando vetores
		nomes = new String[TAMANHO];
		idades = new int[TAMANHO];
		salarios = new float[TAMANHO];
		
		
		
		int qtde = Integer.valueOf(args.length);		
		Scanner in = new Scanner(System.in);		
		if(qtde <= TAMANHO){
			for(int i = 0; i <= qtde ; i++){
				System.out.print("Informe o seu nome: ");						
				nomes[i] = in.next();
				
				System.out.print("Informe sua idade: ");						
				idades[i] = in.nextInt();
				
				System.out.print("Informe seu salário: ");						
				salarios[i] = in.nextFloat();
			}
			imprimir();
		}
		else{
			System.out.println("Impossível realizar o cadastramento");
		}		
		in.close();
	}
}
