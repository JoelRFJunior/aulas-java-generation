package bloco1;

import java.util.Scanner;

public class CalculaMediaAlunos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("\n a média do aluno é  " + media);
		

	}

}
