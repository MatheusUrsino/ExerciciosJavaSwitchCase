package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma nota de 0 a 10: ");
		int nota = sc.nextInt();

		int faixa = (nota >= 9 && nota <= 10) ? 1
				: (nota >= 7 && nota <= 8) ? 2
						: (nota >= 5 && nota <= 6) ? 3
								: (nota >= 3 && nota <= 4) ? 4 : (nota >= 0 && nota <= 2) ? 5 : 0;

		switch (faixa) {
		case 1:
			System.out.println("Classificação: A");
			break;
		case 2:
			System.out.println("Classificação: B");
			break;
		case 3:
			System.out.println("Classificação: C");
			break;
		case 4:
			System.out.println("Classificação: D");
			break;
		case 5:
			System.out.println("Classificação: F");
			break;
		default:
			System.out.println("Erro: Nota inválida. Digite um valor entre 0 e 10.");
			break;
		}

		sc.close();
	}
}
