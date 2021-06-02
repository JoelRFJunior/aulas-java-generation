package bloco1;

import java.util.Scanner;

public class CustoCarroConsumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float custoconsumidor, custofabrica, imposto, distribuidor;
		System.out.println("\nQuanto um carro custa para a fábrica?");
		custofabrica = leia.nextInt();
		imposto = (custofabrica * 45) / 100;
		distribuidor = (custofabrica * 28) / 100;

		custoconsumidor = custofabrica + imposto + distribuidor;

		System.out.println("o custo do carro para o consumidor é de "+ custoconsumidor);

	}

}
