package bloco1;

import java.util.Scanner;

class CategoriaPorIdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("\ndigite a idade do usuário numero");
		idade = ler.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nsua categoria é infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nsua categoria é juvenil");

		} else if (idade >= 18) {
			System.out.println("\nsua categoria é adulto");

		} else {
			System.out.println("\nnão existe uma categoria para sua idade");


		}

	}

}
