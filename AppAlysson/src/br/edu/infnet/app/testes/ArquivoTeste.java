package br.edu.infnet.app.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
				String dir = "C:/Users/alyss/OneDrive/Área de Trabalho/INFNET/3º - Desenvolvimento JAVA/1_fundamentos_java/workspace-JavaDesenvolvimento/";
				String arq = "teste.txt";
				
				//para fazer leitura de arquivo:
				FileReader file = new FileReader(dir+arq); //para verificar a existência do arquivo
				//para salvar as informações do arquivo:
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);

				
				
				
				
				String linha = leitura.readLine();
				
				String[] campos = null;
				
				int qtde = 0;
				float valorFinal = 0;
				
				while(linha != null){
					
					campos = linha.split(";");
					
					switch (campos[0].toLowerCase()) {
					case "a":
						System.out.println("Administrativo");
						
						Administrativo adm = new Administrativo();
						adm.setNome(campos[1]);
						adm.setIdade(Integer.valueOf(campos[2]));
						adm.setSalario(Float.valueOf(campos[3]));
						adm.setBonus(Float.valueOf(campos[4]));
						adm.setDesconto(Float.valueOf(campos[5]));
						adm.imprimir();
						
						escrita.write(adm.obterStringSalarioPorFuncionario());
						qtde++;
						valorFinal = valorFinal + adm.getSalario();

						break;
					case "e":
						
						Estagiario e = new Estagiario();
						e.setNome(campos[1]);
						e.setIdade(Integer.valueOf(campos[2]));
						e.setFaculdade(campos[4]);
						e.setPeriodo(Integer.valueOf(campos[5]));
						e.setSalario(Float.valueOf(campos[3]));
						e.imprimir();
						System.out.println("Estágiario");
						
						escrita.write(e.obterStringSalarioPorFuncionario());
						
						qtde++;
						valorFinal = valorFinal + e.getSalario();

						break;
						
					case "p":
						
						Programador p = new Programador(campos[1], Integer.valueOf(campos[2]));
						p.setDevFull(Boolean.valueOf(campos[5]));
						p.setLinguagem(campos[4]);
						p.setSalario(Float.valueOf(campos[3]));
						p.imprimir();						
						System.out.println("Programador");
						
						escrita.write(p.obterStringSalarioPorFuncionario());
						
						qtde++;
						valorFinal = valorFinal + p.getSalario();

						break;

					default:
						break;
					}
					
					
					
					//System.out.println("Linha: " + linha);
				
					//System.out.println(campos);
					//System.out.println(Arrays.asList(campos)); // asList para transformar em arrays
					linha = leitura.readLine();
				}
				
				escrita.write(qtde+ ";" + valorFinal);

				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] " + e.getMessage());
			}
		} finally { // faz com que aconteça o processamento, mesmo o catch acontecendo
			
			System.out.println("Processamento finalizado com sucesso");		
		}
		
	}

}
