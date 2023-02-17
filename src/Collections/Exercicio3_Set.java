package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro");
			int numeroEscolhido = ler.nextInt();
			set.add(numeroEscolhido);
		}

		Iterator<Integer> iMySet = set.iterator();
		
		System.out.println("Listar dados da set:");
		while (iMySet.hasNext()) {

			System.out.println(iMySet.next());
		}

	}

}
