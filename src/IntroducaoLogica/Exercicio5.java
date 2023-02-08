package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia as 2 notas de um aluno e calcule a média final
		 * deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3
		 * e 5, respectivamente.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite sua primeira nota: ");
		int nota1 = ler.nextInt();
		
		System.out.println("Digite sua segunda nota: ");
		int nota2 = ler.nextInt();
 
		double mediaPonderada = (2.3 * nota1 + 5 * nota2) / (2.3 + 5);
		
		System.out.printf("\n A Média ponderada dos números é = %.2f %n" , mediaPonderada);
	}

}
