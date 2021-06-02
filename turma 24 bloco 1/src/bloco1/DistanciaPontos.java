package bloco1;

import java.util.Scanner;

public class DistanciaPontos {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, distancia, soma1, soma2;
		Scanner leia = new Scanner(System.in);
		System.out.println("\ndigite ovalores do ponto P1, x1");
		x1 = leia.nextInt();
		System.out.println("\ndigite ovalores do ponto P1, y1");
		y1 = leia.nextInt();
		System.out.println("\ndigite ovalores do ponto P2, x2");
		x2 = leia.nextInt();
		System.out.println("\ndigite ovalores do ponto P2, y2");
		y2 = leia.nextInt();

		soma1 = Math.pow((x2 - x1), 2.0);

		soma2 = Math.pow((y2 - y1), 2.0);

		distancia = Math.sqrt((soma1 + soma2));

		System.out.println(" a distancia entre os pontos é "+distancia);
		// TODO Auto-generated method stub

	}

}
