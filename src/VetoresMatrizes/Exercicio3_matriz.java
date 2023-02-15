package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio3_matriz {

	public static void main(String[] args) {
		
		int[][] valor = new int[3][3];
		int linha,coluna;
		int somaPrincipal, somaSecundaria;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("\n Entre com um valor: ");
				valor[linha][coluna] = ler.nextInt();
			}
		}
		
		somaPrincipal = valor[0][0] + valor[1][1] + valor[2][2];
		somaSecundaria = valor[0][2] + valor[1][1] + valor[2][0];
		
		System.out.println("Elementos da Diagonal Principal: " + valor[0][0] + ", " + valor[1][1] + ", " + valor[2][2]);
		System.out.println("Elementos da Diagonal Secundária: " + valor[0][2] + ", " + valor[1][1] + ", " + valor[2][0]);
	    System.out.println("Soma dos Elementos da Diagona Principal: " + somaPrincipal);
	    System.out.println("Soma dos Elementos da Diagona Secundária: " + somaSecundaria);
	    
	}

}
