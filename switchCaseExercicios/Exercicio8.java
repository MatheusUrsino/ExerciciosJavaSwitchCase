package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha a conversão de temperatura:");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Celsius");
		System.out.print("Digite sua escolha (1 ou 2): ");
		int escolha = sc.nextInt();

		if (escolha == 1) {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = (celsius * 9 / 5) + 32;
			System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
		} else if (escolha == 2) {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			double celsius = (fahrenheit - 32) * 5 / 9;
			System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
		} else {
			System.out.println("Opção inválida.");
		}

		sc.close();
	}

}
