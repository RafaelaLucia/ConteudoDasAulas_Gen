package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_List {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			   
			   numeros.add(i+1);
			}
		
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int num = ler.nextInt();
		
		if(numeros.contains(num)) {
			System.out.println("O número" + num + "foi encontrado na posição" + numeros.indexOf(num));
		}else
			System.out.println("O número" + num + "Não foi encontrado! :(");
		

	}

}
