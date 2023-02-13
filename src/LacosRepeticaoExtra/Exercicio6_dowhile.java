package LacosRepeticaoExtra;

import java.util.Scanner;

public class Exercicio6_dowhile {

	public static void main(String[] args) {

		int num, i=0;
        double guardar = 0, media = 0 ;
        
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número inteiro: ");
		num = leia.nextInt();

		do {
			
			if( num % 3 == 0) {
			   i++;
			   guardar += num;
			   media = guardar  / i;
			}
			
			System.out.println("\nDigite um número inteiro: ");
			num = leia.nextInt();

		} while (num != 0);

		System.out.println("\nA média dos múltiplos de 3 é: " + media);

	}

}
