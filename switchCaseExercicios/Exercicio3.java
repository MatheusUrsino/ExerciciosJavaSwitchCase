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
                System.out.println("Classifica��o: Crian�a");
                break;
            case 2:
                System.out.println("Classifica��o: Adolescente");
                break;
            case 3:
                System.out.println("Classifica��o: Adulto");
                break;
            case 4:
                System.out.println("Classifica��o: Idoso");
                break;
            default:
                System.out.println(" Idade inv�lida.");
                break;
        }

		sc.close();
	}

}
