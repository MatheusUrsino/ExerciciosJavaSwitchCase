package switchCaseExercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaEscolhido;
		boolean continuar = true;
		char verificador;




		
	while(continuar)
	{
		System.out.println("Escolha um numero referente aos dias da semana");
		diaEscolhido = sc.nextInt();
		switch (diaEscolhido) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Domingo");
			break;
		}
		System.out.println("Deseja repetir a operação?");
        String entrada = sc.next();
		verificador = Character.toLowerCase(entrada.charAt(0));
		if(verificador == 's' )
		{
			continuar = true;

		}
		else
		{
			continuar = false;
		}

	}
		System.out.println("Fim da Operação");
	

		sc.close();
	}

}
