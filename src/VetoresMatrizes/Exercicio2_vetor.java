package VetoresMatrizes;

public class Exercicio2_vetor {

	public static void main(String[] args) {
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int somar;

		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 == 0) {
			 System.out.println("O número " + vetor[i] + " é par!");
		    }
			
		}
		
	}

}
