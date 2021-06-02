package bloco1;

import java.util.Scanner;

public class ExpressãoTresNumerosInteirosPositivos {

	public static void main(String[] args) {
		
		double numero1, numero2, numero3, expressaoD, expressaoR, expressaoS;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\ndigite o numero A");
		numero1 = leia.nextFloat();
		System.out.println("\ndigite o numero B");
		numero2 = leia.nextFloat();
		System.out.println("\ndigite o numero C");
		numero3 = leia.nextFloat();
		
		expressaoR = Math.pow((numero1 + numero2), 2.0);
		expressaoS = Math.pow((numero2 + numero3), 2.0);
		expressaoD = (expressaoR + expressaoS)/2;
		
		
		System.out.println("\nO resultado da expressão é " + expressaoD);
		
		
		

	}

}
