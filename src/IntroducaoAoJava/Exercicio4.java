package IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		// Exercicio 04 - Leia quatro valores int calcule e mostre a diferença do
		// produto entre o n1 e n2 pelo produto entre o n3 e o n4

		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, n4, calculo;

		System.out.println("Olá, digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		System.out.println("Digite o quarto número: ");
		n4 = ler.nextInt();

		calculo = (n1 * n2) - (n3 * n4);

		System.out.println("\n O produto do primeiro e segundo número e o produto do terceiro e quarto número tem diferença igual a: " + calculo);

	}
}
