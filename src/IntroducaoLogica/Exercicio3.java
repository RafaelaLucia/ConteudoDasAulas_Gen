package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/* Faça um programa que leia o tempo de duração de um evento 
		 * em uma fábrica expressa em segundos e mostre-o expresso em horas, 
		 * minutos e segundos.*/
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o tempo de duração total do evento em segundos: ");
		int tempoEvento = ler.nextInt();
		
		int horas = tempoEvento / 3600; 
		int minutos = (tempoEvento % 3600) / 60; 
		int segundos = (tempoEvento % 3600) % 60; 
		
		System.out.println("O evento teve duração de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos!");
		

	}

}
