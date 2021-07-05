package exerciciolista1;

import  java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {
		double a, b, c, r, s, d;
		Scanner leia = new Scanner(System.in);
		  
		System.out.println("Digite o valor de a");
		 a = leia.nextDouble();
		
		 System.out.println("Digite o valor de b");
		 b = leia.nextDouble();
		 
		 System.out.println("Digite o valor de c");
		 c = leia.nextDouble();
		 
		 r = Math.pow((a+b),2);
         s = Math.pow((b+c),2);

         d = ((r+s)/2);
         
         System.out.println("resultado "+ d);
	}

}
