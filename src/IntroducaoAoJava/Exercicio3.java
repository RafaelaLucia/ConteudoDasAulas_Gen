package IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercicio 3 - Elabore um algoritmo que leia informações de um colaborador e
		// exiba na tela o Salário Líquido.

		Scanner ler = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtra, descontos, salarioLiquido;

		System.out.println("Olá colaborador, digite seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.println("digite seu adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		System.out.println("digite suas horas extras (caso não haja digitar 0): ");
		horasExtra = ler.nextFloat();
		System.out.println("digite seus descontos (somados): ");
		descontos = ler.nextFloat();

		System.out.println("O salário líquido do colaborador(a) é: " + (salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra * 5) - descontos));

	}

}
