package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia a idade de uma pessoa 
		 * expressa em dias e mostre-a expressa em anos, meses e dias 
		 * (considere que: 1 ano = 365 dias / 1 mês = 30 dias e 1 dia = 
		 * 1 dia em todos os casos).
		 */
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira sua idade em dias: ");
		int Idadedias = ler.nextInt();
		
		int anos = Idadedias / 365; //dividir a idade por 365 dias (que é equivalente a um ano) gerando o resultado de anos de vida
		int meses = (Idadedias % 365) / 30; //pegar o resto da divisão dos anos e dividir por 30 para saber quantos meses de vida
		int dias = (Idadedias % 365) % 30; //pegar o resto da divisao dos meses que será os dias
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias :o");
		

	}

}
