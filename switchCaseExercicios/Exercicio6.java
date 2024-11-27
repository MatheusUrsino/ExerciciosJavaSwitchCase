
package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma bebida pelo número:");
		System.out.println("1 - Café");
		System.out.println("2 - Chá");
		System.out.println("3 - Suco");
		System.out.println("4 - Refrigerante");
		System.out.print("Digite sua escolha: ");

		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Você escolheu: Café");
			break;
		case 2:
			System.out.println("Você escolheu: Chá");
			break;
		case 3:
			System.out.println("Você escolheu: Suco");
			break;
		case 4:
			System.out.println("Você escolheu: Refrigerante");
			break;
		default:
			System.out.println("Erro: Opção inválida.");
			break;
		}
		sc.close();
	}

}
