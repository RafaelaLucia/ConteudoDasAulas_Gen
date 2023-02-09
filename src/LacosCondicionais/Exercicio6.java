package LacosCondicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("\n Olá, digite seu nome: ");
		String nome = leitura.nextLine();
		
		System.out.println(nome + ", digite o código do seu cargo: ");
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");
		System.out.println("\n\t Digite sua opção: ");
		int op = leitura.nextInt();
		
		switch (op) {
		case 1:
	
			System.out.println("Informe seu salário: ");
			double quant1 = leitura.nextDouble();

			double conta1 = quant1 + (0.1 * quant1);
			System.out.println("Gerente " + nome + ", seu salário agora é: R$" + conta1);

			break;
		case 2:

			System.out.println("Informe seu salário: ");
			double quant2 = leitura.nextDouble();

			double conta2 = quant2 + (0.07 * quant2);
			System.out.println("Vendedor(a) " + nome + ", seu salário agora é: R$" + conta2);

			break;
		case 3:

			System.out.println("Informe seu salário: ");
			double quant3 = leitura.nextDouble();

			double conta3 = quant3 + (0.09 * quant3);
			System.out.println("Supervisor(a) " + nome + ", seu salário agora é: R$" + conta3);

			break;
		case 4:
			
			System.out.println("Informe seu salário: ");
			double quant4 = leitura.nextDouble();

			double conta4 = quant4 + (0.06 * quant4);
			System.out.println("Motorista " + nome + ", seu salário agora é: R$" + conta4);

			break;
		case 5:
			
			System.out.println("Informe seu salário: ");
			double quant5 = leitura.nextDouble();

			double conta5 = quant5 + (0.05 * quant5);
			System.out.println("Estoquista " + nome + ", seu salário agora é: R$" + conta5);

			break;
		case 6:

			System.out.println("Informe seu salário: ");
			double quant6 = leitura.nextDouble();

			double conta6 = quant6 + (0.08 * quant6);
			System.out.println("Técnico(a) de TI " + nome + ", seu salário agora é: R$" + conta6);

			break;
		default:
			System.out.println("\n Opção inválida!!!");
		}
	}

}
