package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio1_vetor {

	public static void main(String[] args) {
		
		int[] vetorInteiros = {2,5,1,3,4,9,7,8,10,6};
		int posicao = -96;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Digite o número que você deseja encontrar: ");
		int numero = ler.nextInt();
			
		for (int i = 0; i < vetorInteiros.length; i++) {
			   
			   if(vetorInteiros[i] == numero) {
			      posicao = i;
			      break;
			   }
			}
		
		if(posicao == -96) {
			System.out.println("\n O número " + numero + " não foi encontrado!");
		} else {
			System.out.println("\n O número " + numero + " está na posição: " + posicao);
		}

	}

}
