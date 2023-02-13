package LacosCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
    double saldo = 1000.00;		
    String escolha = "s";
    
	Scanner ler = new Scanner(System.in);
		
	while (!escolha.equalsIgnoreCase("n")) {
		
		System.out.println(
		    "Bem Vinde ao Banco Pague+\n"      + 
		"____________________________________\n" +
		"| Código da Operação  |  Operação  |\n" +
		"|_____________________|____________|\n" +
		"|         1           |   Saldo    |\n" +
		"|_____________________|____________|\n" +
		"|         2           |   Saque    |\n" +
		"|_____________________|____________|\n" +
		"|         3           |  Depósito  |\n" +
		"|_____________________|____________|\n" +
		
		"Insira o código da sua Opção: ");
		int opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			
			System.out.println("Operação - Saldo\n");
			System.out.println("Seu saldo disponível é de: R$" + saldo);
			
			System.out.println("\nDeseja realizar outra ação?\n" +
					"Digite S para Sim\n" +
					"Digite N para Não");
					escolha = ler.next();
			
			break;
		case 2:

			System.out.println("Operação - Saque\n");
			System.out.println("Insira o valor que deseja sacar: ");
			double saque = ler.nextDouble();
			
			if(saque > saldo) {
				System.out.println("Saldo Insuficiente!");
			}else {
				saldo = saldo - saque;
				System.out.println("Novo Saldo: R$" + saldo);
			}
			
			System.out.println("\nDeseja realizar outra ação?\n" +
					"Digite S para Sim\n" +
					"Digite N para Não");
					escolha = ler.next();
			
			break;
		case 3:

			System.out.println("Operação - Depósito\n");
			System.out.println("Insira o valor que deseja depositar: ");
			double deposito = ler.nextDouble();
			
			saldo = saldo + deposito;
			
			System.out.println("Novo Saldo: R$" + saldo);
			
			System.out.println("\nDeseja realizar outra ação?\n" +
					"Digite S para Sim\n" +
					"Digite N para Não");
					escolha = ler.next();
		
			break;
		default:
			System.out.println("\n Opção inválida!!!");
		}
	
      }
	
	System.out.println("\nSistema finalizado :)");
	
	
	}

}
