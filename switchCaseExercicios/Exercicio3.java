package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        int faixaEtaria = (idade >= 0 && idade <= 12) ? 1 :
                          (idade >= 13 && idade <= 17) ? 2 :
                          (idade >= 18 && idade <= 59) ? 3 :
                          (idade >= 60) ? 4 : 0;

        switch (faixaEtaria) {
            case 1:
                System.out.println("Classificação: Criança");
                break;
            case 2:
                System.out.println("Classificação: Adolescente");
                break;
            case 3:
                System.out.println("Classificação: Adulto");
                break;
            case 4:
                System.out.println("Classificação: Idoso");
                break;
            default:
                System.out.println(" Idade inválida.");
                break;
        }

		sc.close();
	}

}
