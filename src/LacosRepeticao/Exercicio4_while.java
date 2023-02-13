package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4_while {

	public static void main(String[] args) {
		
		int qtdBack = 0;
		int qtdFront = 0;
		int qtdHomem40 = 0;
		int qtdMulher30 = 0;
		String escolha = "s";
		
		Scanner ler = new Scanner(System.in);
		
		while (!escolha.equalsIgnoreCase("n")) {
			
			System.out.println("\nInsira sua idade: ");
			int idade = ler.nextInt();
			
			System.out.println("\nInsira seu gênero:\n" + 
			"1 - Masculino\n" +
			"2 - Feminino\n" +
			"3 - Outros");
			int genero = ler.nextInt();
			
			System.out.println("\nInsira sua categoria:\n" +
			"1 - BackEnd\n"+ 
			"2 - FrontEnd\n" +
			"3 - Mobile\n" +
			"4 - FullStack");
			int categoria = ler.nextInt();
			
			if(categoria == 1) {
				qtdBack++;
			}else if (genero == 2 && categoria == 2) {
				qtdFront++;
			}else if (genero == 1 && categoria == 3 && idade > 40) {
				qtdHomem40++;
			}else if (genero == 2 && categoria == 4 && idade < 30) {
				qtdMulher30++;
			}
			
			System.out.println("Deseja cadastrar um novo colaboradore?\n" +
			"Digite S para Sim\n" +
			"Digite N para Não");
			escolha = ler.next();
			
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + qtdBack);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + qtdFront);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + qtdHomem40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + qtdMulher30);
		
	}

}
