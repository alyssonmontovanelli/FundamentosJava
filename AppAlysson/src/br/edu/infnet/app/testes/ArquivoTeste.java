package br.edu.infnet.app.testes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		try {
			try {
				//Precisa inverter a dire��o da '\' para '/'
				String dir = "C:/Users/alyss/OneDrive/�rea de Trabalho/INFNET/3� - Desenvolvimento JAVA/1_fundamentos_java/workspace-JavaDesenvolvimento";
				
				String arq = "/teste.txt";
				
				//para fazer leitura de arquivo:
				FileReader file = new FileReader(dir+arq); //para verificar a exist�ncia do arquivo
				
				//para salvar as informa��es do arquivo:
				BufferedReader leitura = new BufferedReader(file);
				
				
				String linha = leitura.readLine();
				
				while(linha != null){
					System.out.println(linha);
					linha = leitura.readLine();
				}

				leitura.close();
				file.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] " + e.getMessage());
			}
		} finally { // faz com que aconte�a o processamento, mesmo o catch acontecendo
			
			System.out.println("Processamento finalizado com sucesso");		
		}
		
	}

}
