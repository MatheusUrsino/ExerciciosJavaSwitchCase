package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("---------------------");
        System.out.println("Ol� Mundo - 1");
        System.out.println("Bem vindo ao Java - 2");
        System.out.println("Sair do Programa - 3");
        System.out.println("---------------------");
        System.out.println();



        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
            	OlaMundo();
                break;
            case 2:
                BemVindo();
                break;
            case 3:
             	Sair();
                break;
            default:
                System.out.println("A��o invalida");
                break;
        }

		sc.close();
	}
	
	public static void OlaMundo()
	{
        System.out.println("Ol� mundo");
	}
	
	public static void Sair()
	{
        System.out.println("Saindo...");
	}
	
	public static void BemVindo()
	{
        System.out.println("Bem vindo ao Java");
	}
	
	

}
