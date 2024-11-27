package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite qual tipo de opera��o deseja (+, -, *, /): ");
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
                   System.out.println("Divis�o por zero n�o � permitida.");
               }
               break;
           default:
               System.out.println("Operador inv�lido. Use +, -, * ou /.");
               break;
       }

	

		sc.close();
	}

}
