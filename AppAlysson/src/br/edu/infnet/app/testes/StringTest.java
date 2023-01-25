package br.edu.infnet.app.testes;

public class StringTest {

	public static void main(String[] args) {
		String nome = "Alysson Montovanelli da Silva de Melo";
		
		System.out.println(nome);
		System.out.println("CharAt: " + nome.charAt(2));
		
		String nomeUp = nome.toUpperCase();
		System.out.println("toUpperCase: " + nomeUp);
		
		String nomeLow = nome.toLowerCase();
		System.out.println("toLowerCase: " + nomeLow);
		
		if(nome.equalsIgnoreCase(nomeUp)){
			System.out.println("Nomes iguais");
		}
		else{
			System.out.println("Nomes diferentes");
		}
		
		System.out.println("indexOf e lastIndexOf: " + nome.indexOf("n") + " - " + nome.lastIndexOf("a"));
		
		System.out.println(nome.substring(3));
		
		// Pegando primeiro nome
		
		System.out.println("Substring 'Alysson' :" + nome.substring(0, nome.indexOf(" ")));
		System.out.println("nome e ultimo nome com substring: " + nome.substring(0, nome.indexOf(" ")) + " " +
		nome.substring(nome.lastIndexOf(" ")));
		
		
		String nomeErrado = "    Alysson Melo                 ";
		System.out.println("Nome errado " + "["+nomeErrado+"]");
		System.out.println("Nome certo com trim " + "["+nomeErrado.trim()+"]");
		
		
	}

}
