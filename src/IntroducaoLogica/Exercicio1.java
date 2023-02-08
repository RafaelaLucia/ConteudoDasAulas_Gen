package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia a idade de uma pessoa 
		 * expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		Scanner ler = new Scanner(System.in);	
		
		System.out.println("Insira sua idade em anos: ");
		int anos = ler.nextInt();
		
		System.out.println("Insira quantos mesês você tem (Exemplo: tenho 18 anos e 2 meses, então escreva 2): ");
		int meses = ler.nextInt();
		
		System.out.println("Insira quantos dias você tem (Exemplo: tenho 18 anos e 7 dias, então escreva 7): ");
		int dias = ler.nextInt();
		
		int idadeEmdias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você já viveu aproximadamente " + idadeEmdias + " dias :)");

	}

}
