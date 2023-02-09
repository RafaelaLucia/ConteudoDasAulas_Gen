package LacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\n Digite um número: ");
		int num = ler.nextInt();	
		
		if(num % 2 == 0) {
			if(num > 0) {
				System.out.println("\n O número " + num + " é par e positivo!");
			}else {
				System.out.println("\n O número " + num + " é par e negativo!");
			}
		} else {
			if(num > 0) {
				System.out.println("\n O número " + num + " é ímpar e positivo!");
			}else {
				System.out.println("\n O número " + num + " é ímpar e negativo!");
			}
		}
		
		}
}
