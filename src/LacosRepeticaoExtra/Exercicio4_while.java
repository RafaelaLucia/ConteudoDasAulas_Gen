package LacosRepeticaoExtra;

import java.util.Scanner;

public class Exercicio4_while {

	public static void main(String[] args) {
		
		int i = 1;
		int qtdCalmas = 0;
		int qtdMulherNervo = 0;
		int qtdHomeAgre = 0;
		int qtdOutroCalm = 0;
		int qtd40Nervo = 0;
		int qtd18Calm= 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (i < 15) {
			
			System.out.println(i + "\n- Insira sua idade: ");
			int idade = ler.nextInt();
			System.out.println("\nInsira seu gênero: 1 - Feminino / 2 - Masculino / 3 - Outros");
			int genero = ler.nextInt();
			System.out.println("\nInsira o que mais se identifica: 1 - Sou uma pessoa calma / 2 - sou uma pessoa nervosa / 3 - sou uma pessoa agressiva");
			int comportamento = ler.nextInt();
			
			if (comportamento == 1) {
				qtdCalmas++;
			} 
			
			if (genero == 1 && comportamento == 2) {
				qtdMulherNervo++;
			}
			
			if (genero == 2 && comportamento == 3) {
				qtdHomeAgre++;
			}
			
			if (genero == 3 && comportamento == 1) {
				qtdOutroCalm++;
			}
			
			if (idade > 40 && comportamento == 2) {
				qtd40Nervo++;
			}
			
			if (idade < 18 && comportamento == 1) {
				qtd18Calm++;
			}
			
			i++;
		}
		
		System.out.println("\nTotal de pessoas calmas: " + qtdCalmas);
		System.out.println("\nTotal de mulheres nervosas: " + qtdMulherNervo);
		System.out.println("\nTotal de homens agressivos: " + qtdHomeAgre);
		System.out.println("\nTotal de Outros calmes: " + qtdOutroCalm);
		System.out.println("\nTotal de pessoas maiores de 40 e nervosas: " + qtd40Nervo);
		System.out.println("\nTotal de pessoas menores de 18 e calmas: " + qtd18Calm);

	}

}
