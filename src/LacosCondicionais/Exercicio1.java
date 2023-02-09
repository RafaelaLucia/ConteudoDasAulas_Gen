package LacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um valor para A: ");
		int a = ler.nextInt();
		System.out.println("Insira um valor para B: ");
		int b = ler.nextInt();
		System.out.println("Insira um valor para C: ");
		int c = ler.nextInt();
		
		if(a + b > c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		}else if (a + b == c) {
			System.out.println("A soma de A + B é igual a C");
		}else {
			System.out.println("Algo deu errado...");
		}

	}

}
