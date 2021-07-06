package aulasexemplos;

import java.util.Scanner;

public class AULA {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero=0;
		int x=1;
		int aux=1;
		
		System.out.println("digite numero positivo !!");
		numero= leia.nextInt();
		
		if (numero<=1) {
			
			System.out.println("numero invalido ");
		}
		else {
			do { 
				System.out.printf("%d + ",aux,x);
				x++;
				aux=aux+x;
				
				
		} while(x<numero);
			System.out.print(x);
			System.out.print(" = "+aux);
			
	}	
	
	
	}

}
