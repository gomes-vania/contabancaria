
package contabancaria.menu;

import java.util.Scanner;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		
		while (true) {
			
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("                  Banco do Brasil               ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("                  1 - Criar Conta               ");
			System.out.println("                  2 - Dados da Conta            ");
			System.out.println("                  3 - Ver Saldo da Conta        ");
			System.out.println("                  4 - Sacar                     ");
			System.out.println("                  5 - Depositar                 ");
			System.out.println("                  6 - Transferir                ");
			System.out.println("                  7 - Sair                      ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("Entre com a opção desejada:                     ");
			opcao = leia.nextInt();
			
			if (opcao == 7) {
				System.out.println("\nVocê finalizou seu atendimento. \nBanco do Brasil agradece a preferência!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			       case 1: 
			    	   
			    	   System.out.println("Criar Conta");
			       break;
			       
			       case 2: 
			    	   
			    	   System.out.println("Dados da Conta");
			       break;
			       
			       case 3:
			    	   
			    	   System.out.println("Ver Saldo da Conta");
			       break;
				
			       case 4:
			    	   
			    	   System.out.println("Sacar");
			       break;
			       
			       case 5:
			    	   
			    	   System.out.println("Depositar");
			       break;
			       
			       case 6:
			    	   
			    	   System.out.println("Transferir");
			       break;
			       
			       default:
			    	   System.out.println("Opção inválida!");
		
			}
		}
	}

}
