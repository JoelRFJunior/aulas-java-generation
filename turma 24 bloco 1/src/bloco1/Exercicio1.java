package bloco1;

//import com.sun.tools.javac.parser.Scanner;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);
		int anos, meses , dias, soma;
		System.out.println("\n digite aqui quantos anos você tem de vida");
		anos = leia.nextInt();
		System.out.println("\n digite aqui quantos meses você tem de vida");
		meses = leia.nextInt();
		System.out.println("\n difite aqui quantos dias você tem de vida");
		dias = leia.nextInt();

		soma = (365 * anos) + (30 * meses) + dias;

		System.out.println("\npelos dados informados você tem aproximadadente "+ soma+ " dias de vida") ;
				
				
			}

		}

	


