package bloco1;


import java.util.Scanner;
public class DiasMesesAnosEmDias {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int anos, meses , dias, soma, diasdevida;
		System.out.println("\n difite aqui quantos dias você tem de vida");
		diasdevida = leia.nextInt();

		//soma = (365 * anos) + (30 * meses) + dias;
		anos =  diasdevida/365;
		meses = (diasdevida%365)/30;
		dias = meses%30;
				
				
				

		System.out.println("\nvocê tem "+ anos+" anos "+ meses+" meses "+ dias+" dias") ;
				
				
			}

		

}
