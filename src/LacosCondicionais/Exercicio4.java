package LacosCondicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha um desses: Vertebrado ou Invertebrado? ");
		String classificacao = ler.nextLine();

		if (classificacao.equalsIgnoreCase("Vertebrado")) {

			System.out.println("Agora escolha um dentre estes: Ave ou Mamífero? ");
			String tipo = ler.nextLine();

			if (tipo.equalsIgnoreCase("Ave")) {

				System.out.println("Agora escolha um dentre estes: Carnívoro ou Onívoro?");
				String dietaave = ler.nextLine();

				if (dietaave.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Você escolheu Águia! (vertebrado, ave, carnívoro)");
				} else if (dietaave.equalsIgnoreCase("Onívoro")) {
					System.out.println("Você escolheu Pomba! (vertebrado, ave, onívoro)");
				} else {
					System.out.println("Algo deu errado.... Escolha dentre as opções!");
				}

			} else if (tipo.equalsIgnoreCase("Mamífero")) {
				System.out.println("Agora escolha um dentre estes: Herbívoro ou Onívoro?");
				String dietamam = ler.nextLine();

				if (dietamam.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Você escolheu Vaca! (vertebrado, mamífero, herbívoro)");
				} else if (dietamam.equalsIgnoreCase("Onívoro")) {
					System.out.println("Você escolheu Homem! (vertebrado, mamífero, onívoro)");
				} else {
					System.out.println("Algo deu errado.... Escolha dentre as opções!");
				}

			}

		} else if (classificacao.equalsIgnoreCase("Invertebrado")) {

			System.out.println("Agora escolha um dentre estes: Inseto ou Anelídeo? ");
			String tipo2 = ler.nextLine();

			if (tipo2.equalsIgnoreCase("Inseto")) {

				System.out.println("Agora escolha um dentre estes: Hematófago ou Herbívoro?");
				String dietainseto = ler.nextLine();

				if (dietainseto.equalsIgnoreCase("Hematófago")) {
					System.out.println("Você escolheu Pulga! (invertebrado, inseto, hematófago)");
				} else if (dietainseto.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Você escolheu Lagarta! (invertebrado, inseto, herbívoro)");
				} else {
					System.out.println("Algo deu errado.... Escolha dentre as opções!");
				}

			} else if (tipo2.equalsIgnoreCase("Anelídeo")) {

				System.out.println("Agora escolha um dentre estes: Hematófago ou Onívoro?");
				String dietaanel = ler.nextLine();

				if (dietaanel.equalsIgnoreCase("Hematófago")) {
					System.out.println("Você escolheu Sanguessuga! (invertebrado, anelídeo, hematófago)");
				} else if (dietaanel.equalsIgnoreCase("Onívoro")) {
					System.out.println("Você escolheu Minhoca! (invertebrado, anelídeo, onívoro)");
				} else {
					System.out.println("Algo deu errado.... Escolha dentre as opções!");
				}

			} else {
				System.out.println("Algo deu errado.... Escolha dentre as opções!");
			}
		}

	}

}
