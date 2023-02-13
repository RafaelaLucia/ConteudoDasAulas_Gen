package LacosRepeticaoExtra;

import java.util.Scanner;

public class Exercicio1_for {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num1 = 1000;
		int num2 = 1999;
		int i;

		for (i = num1; i <= num2; i++) {

			if (i % 11 == 5) {
				System.out.println("\n" + i + " dividido por 11 tem resto igual a 5 ");
			}

		}

	}

}
