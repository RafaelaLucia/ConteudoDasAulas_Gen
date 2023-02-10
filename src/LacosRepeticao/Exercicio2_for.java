package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2_for {

	public static void main(String[] args) {
		
		float num,media,mg;
		int par = 0;
		int impar = 0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite o número: ");
			num = leia.nextFloat();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		
		System.out.printf("\n Total de números pares: " + par);
		System.out.printf("\n Total de números ímpares: " + impar);
	
	}

}
