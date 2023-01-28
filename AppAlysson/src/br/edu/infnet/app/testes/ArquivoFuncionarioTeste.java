package br.edu.infnet.app.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.app.dominio.Administrativo;
import br.edu.infnet.app.dominio.Estagiario;
import br.edu.infnet.app.dominio.Programador;

public class ArquivoFuncionarioTeste {
	public static void main(String[] args) {
		
		List<String> mensagens = new ArrayList<>();
		
		
		
		try{
			try {
				String dir = "C:/Users/alyss/OneDrive/Área de Trabalho/INFNET/3º - Desenvolvimento JAVA/1_fundamentos_java/workspace-JavaDesenvolvimento/";
				String arq = "out_teste.txt";
				
				FileReader file = new FileReader(dir+arq); //para verificar a existência do arquivo
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				String[] campos = null;
				
				int qtde = 0;
				float valorFinal = 0;
				
				while(linha != null){
					
					campos = linha.split(";");
						
					//fazendo validação do arquivo
					try {
						qtde = Integer.valueOf(campos[0]);
						valorFinal = Float.valueOf(campos[1]);
					} catch (Exception e) {
						
						String nome = campos[0];
						float salario = Float.valueOf(campos[1]);
						
						String mensagem = String.format("O funcionário %s recebe R$ %.2f", nome, salario);
						mensagens.add(mensagem);
					}					
					linha = leitura.readLine();
				}
				
				for (String msg : mensagens) {
					System.out.println(msg);
				}
				
				leitura.close();
				file.close();
			} catch (IOException e) {
				System.out.println("[ERROR] " + e.getMessage());
			}
		}
		finally { // faz com que aconteça o processamento, mesmo o catch acontecendo
			System.out.println("Processamento finalizado com sucesso");		
			}
	}
	
}
