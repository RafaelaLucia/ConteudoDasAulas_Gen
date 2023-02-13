package LacosRepeticaoExtra;

import java.util.Scanner;

public class Exercicio5_dowhile {

	public static void main(String[] args) {

		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();

		do {
			
			soma += num;	
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();

		} while (num != 0);

		System.out.println("\nA soma dos números é: " + soma);

	}

}
