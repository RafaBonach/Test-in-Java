package exercicios;

import java.util.Scanner;

public class Exercicio1_GrupoSAE {

	public static void main(String[] args) {
		int idade = 0;
		int escolha;
		final int MINIDADE = 18;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		idade = leitura.nextInt();

		if (idade >= MINIDADE) {
			System.out.println("Faca a sua escolha de 1 a 3: ");
			escolha = leitura.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Arrume a Casa.");
				break;
			case 2:
				System.out.println("Va trabalhar.");
				break;
			case 3:
				System.out.println("E seu dia de folga, va descansar.");
				break;

			default:
				System.out.println("Digite um valor valido de 1 a 3");
			}
		}
		else {
			System.out.println("Voce ainda nao tem idade para fazer escolhas, vai estudar!");
		}

	}

}
