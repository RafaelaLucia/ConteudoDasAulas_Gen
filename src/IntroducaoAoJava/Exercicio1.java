package IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Exercício 1 - Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java
		
	    System.out.println("Exercício 01 \n ");
		
		float salario, abono, novoSalario;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		System.out.println("O novo salário é: " + (novoSalario = salario + abono));

	}

}
