package LacosCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Olá! Insira seu nome completo: ");
		String nome = ler.nextLine();
		
		System.out.println("Ótimo, agora insira sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Por fim, você já doou sangue antes? (Escreva true para sim e false para não): ");
		boolean Jadoou = ler.nextBoolean();
		
		if(idade < 18 || idade > 69) {
			System.out.println("Desculpe, mas " + nome + " não está apto(a) para doar sangue!");
		}else if(idade >=18 && idade < 60) {
			System.out.println("Eba, " + nome + " está apto(a) para doar sangue!");
		}else if (idade >=60 && idade < 69 && Jadoou) {
			System.out.println("Como não é sua primeira vez, " + nome + " pode doar sangue!");
		}else {
			System.out.println(nome + " não está apto(a) para doar sangue");
		}

	}

}
