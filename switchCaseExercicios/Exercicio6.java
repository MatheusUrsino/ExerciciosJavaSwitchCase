
package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma bebida pelo n�mero:");
		System.out.println("1 - Caf�");
		System.out.println("2 - Ch�");
		System.out.println("3 - Suco");
		System.out.println("4 - Refrigerante");
		System.out.print("Digite sua escolha: ");

		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Voc� escolheu: Caf�");
			break;
		case 2:
			System.out.println("Voc� escolheu: Ch�");
			break;
		case 3:
			System.out.println("Voc� escolheu: Suco");
			break;
		case 4:
			System.out.println("Voc� escolheu: Refrigerante");
			break;
		default:
			System.out.println("Erro: Op��o inv�lida.");
			break;
		}
		sc.close();
	}

}
