package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*Escreva  um programa que leia três números inteiros 
		  e positivos e calcule a expressão */
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um primeiro número (Positivo): ");
		int A = ler.nextInt();
		System.out.println("Digite um segundo número (Positivo): ");
		int B = ler.nextInt();
		System.out.println("Digite um terceiro número (Positivo): ");
		int C = ler.nextInt();
		
		double R =  Math.pow(A + B, 2);
		double S =  Math.pow(B + C, 2);
	    double D = (R + S) / 2;
	    
	    System.out.println("O resultado foi: " + D);

	}

}
