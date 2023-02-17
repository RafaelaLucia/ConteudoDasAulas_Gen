package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4_Set {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Set<Integer> lista = new HashSet<Integer>();

		
		for (int i = 0; i < 10; i++) {
			   
			lista.add(i+1);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int num = ler.nextInt();
		
	
		Iterator<Integer> iterator = lista.iterator();
		
		int index = 0;
		while (iterator.hasNext()) {
			
		    if (iterator.next().equals(num)) {
		        System.out.println("O número " + num + " foi encontrado na posição: " + index + "!!");
		        break;
		    }index++;
	    }
		
		if(index == lista.size()) {
			System.out.println("O número " + num + " não foi encontrado na lista :(");
		}
		}
		
}

	
