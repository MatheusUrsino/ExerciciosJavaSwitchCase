package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.println("Digite a classificação etária do filme:");
	        System.out.println("G - Livre");
	        System.out.println("PG - Maior de 10 anos");
	        System.out.println("PG-13 - Maior de 13 anos");
	        System.out.println("R - Maior de 18 anos");
	        System.out.print("Digite a classificação (G, PG, PG-13, R): ");
	        String classificacao = sc.nextLine().toUpperCase();
	        
	        switch (classificacao) {
	            case "G":
	                System.out.println("Faixa etária permitida: Livre");
	                break;
	            case "PG":
	                System.out.println("Faixa etária permitida: Maior de 10 anos");
	                break;
	            case "PG-13":
	                System.out.println("Faixa etária permitida: Maior de 13 anos");
	                break;
	            case "R":
	                System.out.println("Faixa etária permitida: Maior de 18 anos");
	                break;
	            default:
	                System.out.println("Classificação inválida.");
	                break;
	        }
		sc.close();
	}

}
