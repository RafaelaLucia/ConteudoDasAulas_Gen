package LacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("\n ---------- Caixa da Lanchonete 3Irmãos ----------");
		System.out.println("\n Digite o código do produto: ");
		System.out.println("\n1 - Cachorro Quente");
		System.out.println("\n2 - X-Salada");
		System.out.println("\n3 - X-Bacon");
		System.out.println("\n4 - Bauru");
		System.out.println("\n5 - Refrigerante");
		System.out.println("\n6 - Suco de Laranja");
		System.out.println("\n\t Digite sua opção: ");
		int op = leitura.nextInt();

		switch (op) {
		case 1:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant1 = leitura.nextDouble();

			double conta1 = quant1 * 10;
			System.out.println("Valor total da compra: R$" + conta1);

			break;
		case 2:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant2 = leitura.nextDouble();

			double conta2 = quant2 * 15;
			System.out.println("Valor total da compra: R$" + conta2);

			break;
		case 3:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant3 = leitura.nextDouble();

			double conta3 = quant3 * 18;
			System.out.println("Valor total da compra: R$" + conta3);

			break;
		case 4:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant4 = leitura.nextDouble();

			double conta4 = quant4 * 12;
			System.out.println("Valor total da compra: R$" + conta4);

			break;
		case 5:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant5 = leitura.nextDouble();

			double conta5 = quant5 * 8;
			System.out.println("Valor total da compra: R$" + conta5);

			break;
		case 6:

			System.out.println("Qual a quantidade que você comprou deste produto?");
			double quant6 = leitura.nextDouble();

			double conta6 = quant6 * 13;
			System.out.println("Valor total da compra: R$" + conta6);

			break;
		default:
			System.out.println("\n Opção inválida!!!");
		}

	}

}
