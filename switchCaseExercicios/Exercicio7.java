package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do seu salário: R$ ");
        double salario = sc.nextDouble();

        double imposto;

        if (salario <= 1500) {
            imposto = salario * 0.05; 
        } else if (salario <= 3000) {
            imposto = salario * 0.10; 
        } else {
            imposto = salario * 0.15;
        }

        System.out.printf("O imposto a ser pago é: R$ %.2f\n", imposto);

		sc.close();
	}

}
