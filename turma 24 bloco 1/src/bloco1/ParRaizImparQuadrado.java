package bloco1;

import java.util.Scanner;

public class ParRaizImparQuadrado {
	  public static void main(String[] args) {
		  double numero;

			Scanner ler = new Scanner(System.in);

			System.out.println("\ndigite um numero");
			numero = ler.nextDouble();
			
			if(numero%2==0) {
				numero = Math.sqrt(numero);
				System.out.println("o numero � par e sua raiz � " + numero );
			}else {
				numero = Math.pow(numero, 2);
				System.out.println("o numero � �mpar e seu quadrado � " + numero );
			}
	}

}
