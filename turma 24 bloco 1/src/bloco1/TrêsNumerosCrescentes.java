package bloco1;

import java.util.Scanner;

public class Tr�sNumerosCrescentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		int a, b, c, auxiliar;

		Scanner ler = new Scanner(System.in);

		System.out.println("\ndigite o primeiro numero");
		a = ler.nextInt();
		System.out.println("\ndigite o segundo numero");
		b = ler.nextInt();
		System.out.println("\ndigite o teceiro numero");
		c = ler.nextInt();

		if (a > b) {

			auxiliar = a;
			a = b;
			b=auxiliar;
		}
		if (a > c) {

			auxiliar = a;
			a = c;
			c = auxiliar;
		}
		if (b > c) {

			auxiliar = b;
			b = c;
			c = auxiliar;

		}

			System.out.println(" " + a + ", " + b + ", " + c);
		}
		
	
}
