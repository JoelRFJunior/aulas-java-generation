package bloco1;

import java.util.Scanner;

public class MaiorDeTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		int a, b, c;

		Scanner ler = new Scanner(System.in);

		System.out.println("\ndigite o primeiro numero");
		a = ler.nextInt();
		System.out.println("\ndigite o segundo numero");
		b = ler.nextInt();
		System.out.println("\ndigite o teceiro numero");
		c = ler.nextInt();

		if (a > b && a > c) {
			System.out.println("\n o maior numero � o primeiro valor: " + a);
		} else if (b > a && b > c) {
			System.out.println("\n o maior numero � o segundo valor: " + b);
		} else if (c > a && c > b) {
			System.out.println("\n o maior numero � o teceiro valor: " + c);
		} else if (a == b && c < b) {
			System.out.println("\n os maiores numeros  s�o primeiro e segundo iguais valor:" + a);
		} else if (c == b && b > a) {
			System.out.println("\n os maiores numeros  s�o segundo e teceiro iguais valor" + b);
		} else if (a == c && a > b) {
			System.out.println("\n  os maiores numeros  s�o primeiro e teceiro iguais valor " + a);
		} else {
			System.out.println("\n os numeros s�o iguais");
		}

	}

}
