package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite qual tipo de operação deseja (+, -, *, /): ");
        char operador = sc.next().charAt(0);
        
		switch (operador) {
		   case '+':
               System.out.println("Resultado: " + (numero1 + numero2));
               break;
           case '-':
               System.out.println("Resultado: " + (numero1 - numero2));
               break;
           case '*':
               System.out.println("Resultado: " + (numero1 * numero2));
               break;
           case '/':
               if (numero2 != 0) {
                   System.out.println("Resultado: " + (numero1 / numero2));
               } else {
                   System.out.println("Divisão por zero não é permitida.");
               }
               break;
           default:
               System.out.println("Operador inválido. Use +, -, * ou /.");
               break;
       }

	

		sc.close();
	}

}
