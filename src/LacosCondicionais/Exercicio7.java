package LacosCondicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("________ CALCULADORA _________");
		System.out.println("|      digite um número       |");
		System.out.println("|_____________________________|");
		double numero1 = ler.nextDouble();
		
		System.out.println("________ CALCULADORA _________");
		System.out.println("|     digite outro número     |");
		System.out.println("|_____________________________|");
		double numero2 = ler.nextDouble();
	
		System.out.println("________ CALCULADORA _________");
		System.out.println("|     escolha uma operação    |");
		System.out.println("|     1 - soma                |");
		System.out.println("|     2 - subtração           |");
		System.out.println("|     3 - multiplicação       |");
		System.out.println("|     4 - divisão             |");
		System.out.println("|_____________________________|");
		int escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
			
			double soma = numero1 + numero2;
			
			System.out.println("__________ CALCULADORA _________");
			System.out.println("\t" + numero1 + " + " + numero2 + " = " + soma + "\t");
			System.out.println("________________________________");
			break;
		case 2:

			double sub = numero1 - numero2;
			
			System.out.println("__________ CALCULADORA _________");
			System.out.println("\t" + numero1 + " - " + numero2 + " = " + sub + "\t");
			System.out.println("________________________________");
			
			break;
		case 3:

			double mult = numero1 * numero2;
			
			System.out.println("__________ CALCULADORA _________");
			System.out.println("\t" + numero1 + " X " + numero2 + " = " + mult + "\t");
			System.out.println("________________________________");
			
			break;
		case 4:

			double div = numero1 / numero2;
			
			System.out.println("__________ CALCULADORA _________");
			System.out.println("\t" + numero1 + " ÷ " + numero2 + " = " + div + "\t");
			System.out.println("________________________________");
			
			break;
		default:
			System.out.println("\n Opção inválida!!!");
		}

		
		
	}

}
