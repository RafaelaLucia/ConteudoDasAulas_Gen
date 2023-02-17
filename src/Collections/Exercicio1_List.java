package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1_List {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList();
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i < 5; i++) {
			System.out.println("Digite a " + (i+1) + "º cor");
			String corEscolhida = ler.nextLine();
			cores.add(corEscolhida);
		}
		
		System.out.println("Todas as Cores: " + cores);
		Collections.sort(cores);
		System.out.println("Cores Ordenadas: " + cores);

	}

}
