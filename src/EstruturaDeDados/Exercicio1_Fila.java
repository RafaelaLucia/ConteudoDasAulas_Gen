package EstruturaDeDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int op;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("_______________________________________\n" + 
			                   "|          Banco GranaFacil           |\n" +
			                   "|_____________________________________|\n" +
			                   "| 1 - Adicionar Clientes na Fila      |\n" +
					           "| 2 - Listar todos Clientes           |\n" +
			                   "| 3 - Retirar Cliente da fila         |\n" +
					           "| 0 - Sair                            |\n" +
					           "|_____________________________________|\n" +
			                   "\n" +
					           "\n Por favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do(a) cliente: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente " + nome + " adicionade a fila!");
			
			break;
			case 2:
				leia.nextLine();
				  if(fila.isEmpty() == true) {
			        	 System.out.println("A Fila está vazia no momento...");
				  }else {					  
					  System.out.println("Lista de Clientes na Fila: " + fila);
				  }
				
			break;
			case 3:
				leia.nextLine();
			         if(fila.isEmpty() == true) {
			        	 System.out.println("A Fila está vazia!");
			         }else {
			        	 System.out.println("Fila: \n cliente " + fila.remove() + " foi Chamado(a)!");
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
