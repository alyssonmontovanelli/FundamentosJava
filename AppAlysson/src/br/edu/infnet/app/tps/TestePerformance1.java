package br.edu.infnet.app.tps;

import java.util.Arrays;
import java.util.Scanner;

public class TestePerformance1 {

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	
	public static void main(String[] args) {
		final int TAMANHO = 2;
		
		nomes = new String[TAMANHO];
		idades = new int[TAMANHO];
		salarios = new float[TAMANHO];
		
		Scanner in = new Scanner(System.in);
		
		// Cria��o do MENU
		String opcao;
		int pos = 0; // PARA posicionar informa��es nos Arrays
		
		do{
			System.out.println("[1] Cadastrar"); 
			System.out.println("[2] Consultar um"); 
			System.out.println("[3] Consultar todos"); 
			System.out.println("[4] Sair");
			System.out.print("Digite uma das op��es do menu:");
			opcao = in.next();
			
			//SWITCH ( serve para condicionais de valores definidos do tipo "1","2", "3"... - if deve ser usado para "x>220";
			
			switch(opcao){
			case "1":
				if(pos < TAMANHO){
					System.out.print("Informe o seu nome: ");						
					nomes[pos] = in.next();
					
					System.out.print("Informe sua idade: ");						
					idades[pos] = in.nextInt();
					
					System.out.print("Informe seu sal�rio: ");						
					salarios[pos] = in.nextFloat();
					
					System.out.println("Usu�rio " + nomes[pos] + " Cadastrado no �ndice nr: " + (pos+1));
					
					pos++;
				
				}
				else{
					System.out.println("Imposs�vel continuar o cadastramento, n�mero de cadastro atingiu o lim�te");
				}
				System.out.println(Arrays.toString(nomes));
				break;
				
			case "2":
				int indice;
				
				System.out.println("Por favor, qual �ndice procura?");
				indice = Integer.valueOf(in.nextInt() - 1);
				
				if(indice >= 0 && indice <= TAMANHO && nomes[indice] != null){
					System.out.println(nomes[indice] + " - " + idades[indice] + " - " + salarios[indice] + " - ");	
				}
				else{
					System.out.println("Indice n�o possui usu�rio cadastrado");
				}
				break;
				
			case "3":
				
				for(int i = 0 ; i < pos ; i++ ){
					System.out.println("Cadastro n�mero " + (i+1) + ": " + nomes[i] + " - " + idades[i] + " - " + salarios[i]);	
				}
				
				break;
				
			default:
				
				System.out.println("Op��o inv�lida");
				
				break;
			}
			
			
		}while(!"4".equals(opcao)); // EQUALS serve para comparar string - n�o utilizar o "="
		
		System.out.println("Processamento finalizado!");
		
		
		in.close();
	}

}
