package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		
		System.out.println("DGA - Distribuidora de Gênero Alimentício:");
		System.out.println();
		System.out.println("1 - Cadastrar Clientes.");	
		System.out.println("2 - Cadastrar Produtos.");	
		System.out.println();	
		System.out.print("Digite uma opção: ");
		opcao = sc.nextLine();
		
		
		
		sc.close();
	}

}
