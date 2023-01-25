package br.edu.infnet.app.tps;

import java.util.Arrays;
import java.util.Scanner;

import br.edu.infnet.app.dominio.Administrativo;

public class TestePerformance2 {

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	
	private static Administrativo[] administrativos; // importando classe e criando vetor unico 
	
	public static void main(String[] args) {
		final int TAMANHO = 2;
		
		nomes = new String[TAMANHO];
		idades = new int[TAMANHO];
		salarios = new float[TAMANHO];
		
		administrativos = new Administrativo[TAMANHO];
		
		Scanner in = new Scanner(System.in);
		
		// Criação do MENU
		String opcao;
		int pos = 0; // PARA posicionar informações nos Arrays
		
		do{
			System.out.println("[1] Cadastrar"); 
			System.out.println("[2] Consultar um"); 
			System.out.println("[3] Consultar todos"); 
			System.out.println("[4] Sair");
			System.out.print("Digite uma das opções do menu:");
			opcao = in.next();
			
			//SWITCH ( serve para condicionais de valores definidos do tipo "1","2", "3"... - if deve ser usado para "x>220";
			
			
			
			switch(opcao){
			case "1":
				if(pos < TAMANHO){
					
					Administrativo adm = new Administrativo(); //instanciando o objeto ADM, para coletar as informações e jogar para adm
					
					System.out.print("Informe o seu nome: ");						
					adm.setNome(in.next()); //nomes[pos] = in.next();
					
					System.out.print("Informe sua idade: ");						
					adm.setIdade(in.nextInt()); //idades[pos] = in.nextInt();
					
					System.out.print("Informe seu salário: ");						
					adm.setSalario(in.nextFloat()); //salarios[pos] = in.nextFloat();
					
					System.out.println("Usuário " + nomes[pos] + " Cadastrado no índice nr: " + (pos+1));
					
					administrativos[pos] = adm;
					
					pos++;
				
				}
				else{
					System.out.println("Impossível continuar o cadastramento, número de cadastro atingiu o limíte");
				}
				System.out.println(Arrays.toString(nomes));
				break;
				
			case "2":
				int indice;
				
				System.out.println("Por favor, qual índice procura?");
				indice = Integer.valueOf(in.nextInt() - 1);
				
				if(indice >= 0 && indice <= TAMANHO && nomes[indice] != null){
					System.out.println(administrativos[indice].getSalario() + " - " + administrativos[indice].getIdade() + " - " + administrativos[indice].getNome());	
				}
				else{
					System.out.println("Indice não possui usuário cadastrado");
				}
				break;
				
			case "3":
				
				for(int i = 0 ; i < pos ; i++ ){
					System.out.println("Cadastro número " + (i+1) + ": " + nomes[i] + " - " + idades[i] + " - " + salarios[i]);	
				}
				
				break;
				
			default:
				
				System.out.println("Opção inválida");
				
				break;
			}
			
			
		}while(!"4".equals(opcao)); // EQUALS serve para comparar string - não utilizar o "="
		
		System.out.println("Processamento finalizado!");
		
		
		in.close();
	}

}
