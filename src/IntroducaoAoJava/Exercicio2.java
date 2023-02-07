package IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
        // Elabore um algoritmo em Java que leia 4 notas de um participante e exiba na tela a média final 
		Scanner ler = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = ler.nextFloat();
		
		System.out.printf("\n A média final foi de = %.2f %n", (media = nota1 + nota2 + nota3 + nota4)/4 );
	}

}
