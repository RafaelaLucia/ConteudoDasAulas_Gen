package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1_for {

	public static void main(String[] args) {
		
		int i;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		int num1 = ler.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		int num2 = ler.nextInt();
	
			if(num1 > num2) {
				
				System.out.println("\nIntervalo inválido! >:( ");
				
			}else {
				
				for(i = num1; i <=num2; i++) {
					
					if( i % 3 == 0 && i % 5 == 0) {
						System.out.println("\n"+ i + " é múltiplo de 3 e 5! ");
					}
			}
			
		}
	}

}
