package EstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {

	public static void main(String[] args) {
		

		Stack<String> pilha = new Stack<String>();
		int op;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("_______________________________________\n" + 
			                   "|          Empilhar Livros            |\n" +
			                   "|_____________________________________|\n" +
			                   "| 1 - Adicionar Livro na Pilha        |\n" +
					           "| 2 - Listar todos os Livros          |\n" +
			                   "| 3 - Retirar Livro da Pilha          |\n" +
					           "| 0 - Sair                            |\n" +
					           "|_____________________________________|\n" +
			                   "\n" +
					           "\n Por favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do livro que deseja adicionar na pilha: ");
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("Livro " + nome + " adicionado à fila!");
			
			break;
			case 2:
				leia.nextLine();
				  if(pilha.isEmpty() == true) {
			        	 System.out.println("A Pilha está vazia no momento...");
				  }else {					  
					  System.out.println("Lista de Livros na Pilha: " + pilha);
				  }
				
			break;
			case 3:
				leia.nextLine();
			         if(pilha.isEmpty() == true) {
			        	 System.out.println("A Pilha está vazia!");
			         }else {
			        	 System.out.println("Pilha: \n O livro " + pilha.pop() + " foi retirado da pilha!");
			         }
			break;
			case 0:
				leia.nextLine();
				System.out.println("Programa Finalizado! Obrigado(a) por utilizar nosso sistema :)");
			break;
			default:
				System.out.println("Número Inválido, por favor tente novamente");
			}
			
			}while(op != 0);
	}

}
