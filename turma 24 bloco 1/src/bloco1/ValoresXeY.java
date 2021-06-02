package bloco1;

import java.util.Scanner;

public class ValoresXeY {
	public static void main(String[] args) {
	double a,b,c,d,e,f,x,y;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\n entre com o valor de A: ");
	a = leia.nextInt();
	System.out.println("\n entre com o valor de B: ");
	b = leia.nextInt();
	System.out.println("\n entre com o valor de C: ");
	c = leia.nextInt();
	System.out.println("\n entre com o valor de D: ");
	d = leia.nextInt();
	System.out.println("\n entre com o valor de E: ");
	e = leia.nextInt();
	System.out.println("\n entre com o valor de F: ");
	f = leia.nextInt();

	x= (c*e - b*f)/(a*e - b*d);

	y = (a*f - c*d)/(a*e - b*d);

	System.out.println("\n o valor de x e y são respectivamente: "+ x +","+y);
	}
}
