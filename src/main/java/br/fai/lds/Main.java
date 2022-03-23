package br.fai.lds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main App = new Main();
		App.start();

	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void start() {
		boolean emExecucao = true;
		
		int opcao = -1;
		
		while (emExecucao) {
			exibirMenu();
			
			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
			
				scanner.next();
				System.out.println(e.getMessage());
				System.out.println("Ocorreu um erro");
				System.out.println("---------");
				
				continue;
			}
				
				   switch (opcao){
				     
			    	case 1:
			    		cadastrarCavalo();
			            break;
			        case 2:
			            cadastrarGirafa();
			            break;
			        case 3:
			        	listrarCavalos();
			            break;
			        case 4:
			        	listrarGirafa();
			            break;
			        case 5:
			            mostrarTodosAnimais();
			            break;
			        case 6:
			           removerAnimalPorId();
			            break;
			        case 7:
			            exibirAnimaisPorTipo();
			            break;
			        case 8:
			            
			            break;    
			}
				   
			}
		}
	
	private static void exibirMenu() {
		System.out.println("1.	Cadastrar cavalo\r\n"
				+ "2.	Cadastrar girafa\r\n"
				+ "3.	Listar cavalos\r\n"
				+ "4.	Listar girafas\r\n"
				+ "5.	Listar todos os animais\r\n"
				+ "6.	Remover um animal por id\r\n"
				+ "7.	Exibir a quantidade de animais cadastrados por tipo\r\n"
				+ "8.	Sair\r\n"
				+ "");
	}
	
	
	public static void cadastrarCavalo() {
		System.out.println("Aninal cadastrado com sucesso !!!");
	}
	
	public static void cadastrarGirafa() {
		
	}
	
	public static void listrarCavalos() {
		
	}
	
	public static void listrarGirafa() {
		
	}
	
	public static void mostrarTodosAnimais() {
		
	}
	
	public static void removerAnimalPorId() {
		
	}
	
	public static void exibirAnimaisPorTipo() {
		
	}
	
	
}
