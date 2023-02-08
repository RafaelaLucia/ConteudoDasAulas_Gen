package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		/*Construa um programa em java que, tendo como dados de entrada dois pontos
		 *quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre 
		 *eles */
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro ponto x");
		double x1 = ler.nextDouble();
		System.out.println("Informe o segundo ponto x");
		double x2 = ler.nextDouble();
		System.out.println("Informe o primeiro ponto y");
		double y1 = ler.nextDouble();
		System.out.println("Informe o segundo ponto y");
		double y2 = ler.nextDouble();

		double parenteses1 =  Math.pow(x2 - x1, 2);
		double parenteses2 =  Math.pow(y2 - y1, 2);
		
		double calculo = Math.sqrt(parenteses1 + parenteses2);
		System.out.printf("\n a distância entre os dois pontos é: %.2f %n" , calculo);
	}

}
