package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que lê os coeficientes a,b,c,d,e e f e calcula
		 *  e mostra os valores de x e y. */ 

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor coeficinte A");
		double a = ler.nextDouble();
		System.out.println("Digite o valor coeficinte B");
		double b = ler.nextDouble();
		System.out.println("Digite o valor coeficinte C");
		double c = ler.nextDouble();
		System.out.println("Digite o valor coeficinte D");
		double d = ler.nextDouble();
		System.out.println("Digite o valor coeficinte E");
		double e = ler.nextDouble();
		System.out.println("Digite o valor coeficinte F");
		double f = ler.nextDouble();
		
		double x = (c * e - b * f) / (a * e - b * d);
		double y = (c * d - f * a) / (b * d - e * a);
		
		System.out.printf("\n O valor de x é %.2f e o valor de y é %.2f " , x, y);
		
	}
}
