package LacosRepeticao;

import java.util.Scanner;

public class Exercicio3_while {

	public static void main(String[] args) {
		
	    int num;
	    int countMenor = 0;
	    int countMaior = 0;
	    
	    Scanner leia = new Scanner(System.in);

	    System.out.println("\nDigite uma idade: ");
	    num = leia.nextInt();

	    while (num >= 0) {
	        if (num < 21) {
	            countMenor++;
	        } else if (num > 50) {
	            countMaior++;
	        }
	        System.out.println("\nDigite uma idade: ");
	        num = leia.nextInt();
	    }

	    System.out.println("\nTotal de pessoas menores de 21 anos: " + countMenor);
	    System.out.println("\nTotal de pessoas maiores de 50 anos: " + countMaior);
	}

}
