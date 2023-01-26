package br.edu.infnet.app.testes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import br.edu.infnet.app.dominio.Administrativo;
import br.edu.infnet.app.dominio.Estagiario;
import br.edu.infnet.app.dominio.Programador;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		try {
			try {
				//Precisa inverter a direção da '\' para '/'
				String dir = "C:/Users/alyss/OneDrive/Área de Trabalho/INFNET/3º - Desenvolvimento JAVA/1_fundamentos_java/workspace-JavaDesenvolvimento";
				
				String arq = "/teste.txt";
				
				//para fazer leitura de arquivo:
				FileReader file = new FileReader(dir+arq); //para verificar a existência do arquivo
				
				//para salvar as informações do arquivo:
				BufferedReader leitura = new BufferedReader(file);
				
				
				String linha = leitura.readLine();
				
				String[] campos = null;
				
				while(linha != null){
					
					campos = linha.split(";");
					
					switch (campos[0].toLowerCase()) {
					case "a":
						System.out.println("Administrativo");
						
						Administrativo admTeste1 = new Administrativo();
						admTeste1.setNome(campos[1]);
						admTeste1.setIdade(Integer.valueOf(campos[2]));
						admTeste1.setSalario(Float.valueOf(campos[3]));
						admTeste1.setBonus(Float.valueOf(campos[4]));
						admTeste1.setDesconto(Float.valueOf(campos[5]));
						admTeste1.imprimir();
	
						break;
					case "e":
						
						Estagiario eTeste1 = new Estagiario();
						eTeste1.setNome(campos[1]);
						eTeste1.setIdade(Integer.valueOf(campos[2]));
						eTeste1.setFaculdade(campos[4]);
						eTeste1.setPeriodo(Integer.valueOf(campos[5]));
						eTeste1.setSalario(Float.valueOf(campos[3]));
						eTeste1.imprimir();
						System.out.println("Estágiario");
						break;
						
					case "p":
						
						Programador progTeste1 = new Programador(campos[1], Integer.valueOf(campos[2]));
						progTeste1.setDevFull(Boolean.valueOf(campos[5]));
						progTeste1.setLinguagem(campos[4]);
						progTeste1.setSalario(Float.valueOf(campos[3]));
						progTeste1.imprimir();						
						System.out.println("Programador");
						break;

					default:
						break;
					}
					
					
					
					//System.out.println("Linha: " + linha);
				
					//System.out.println(campos);
					//System.out.println(Arrays.asList(campos)); // asList para transformar em arrays
					linha = leitura.readLine();
				}

				leitura.close();
				file.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] " + e.getMessage());
			}
		} finally { // faz com que aconteça o processamento, mesmo o catch acontecendo
			
			System.out.println("Processamento finalizado com sucesso");		
		}
		
	}

}
