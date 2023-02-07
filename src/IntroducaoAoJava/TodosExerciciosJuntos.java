package IntroducaoAoJava;

import java.util.Scanner;

public class TodosExerciciosJuntos {

	public static void main(String[] args) {

		/*
		 * Este arquivo foi gerado para juntar todos os exercicios
		 * numa class para ser enviado para plataforma, aconselho
		 * visualizar os exercicios individualmente em suas respectivas classes :)
		 * */
		
		// EXERCICIO 01
		
		System.out.println("Exercício 01 \n ");
		
		float salario, abono, novoSalario;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		System.out.println("O novo salário é: " + (novoSalario = salario + abono));
		
		// EXERCICIO 02
		
		System.out.println("\n Exercício 02");
		
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
		
        //EXERCICIO 03
		
		System.out.println("\n Exercício 03");
		
		float salarioBruto, adicionalNoturno, horasExtra, descontos, salarioLiquido;
		
		System.out.println("Olá colaborador, digite seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.println("digite seu adicional noturno: ");
		adicionalNoturno = ler.nextFloat();
		System.out.println("digite suas horas extras (caso não haja digitar 0): ");
		horasExtra = ler.nextFloat();
		System.out.println("digite seus descontos (somados): ");
		descontos = ler.nextFloat();
		
		System.out.println("O salário líquido do colaborador(a) é: " + (salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra * 5) - descontos));

		  //EXERCICIO 04
		 System.out.println("\n Exercício 04");
		
		int n1, n2, n3, n4, calculo;
		
		System.out.println("Olá, digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		System.out.println("Digite o quarto número: ");
		n4 = ler.nextInt();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		 System.out.println("\n O produto do primeiro e segundo número e o produto do terceiro e quarto número tem diferença igual a: " + calculo);
		 System.out.println("\n Exercícios finalizados :)");
	}

}
