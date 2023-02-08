package IntroducaoLogica;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double distribuidor = 0.28;
		double imposto = 0.45;
		
		System.out.println("Insira o valor do custo de fábrica do carro: ");
		double custofabrica = ler.nextDouble();
		
		double custoDistribuidor = custofabrica * (1 + distribuidor); // aplicado ao custo de fabrica
		double custoConsumidor = custoDistribuidor * (1 + imposto); 
		
		System.out.println("O custo do consumidor é: " + custoConsumidor);
		
	}

}
