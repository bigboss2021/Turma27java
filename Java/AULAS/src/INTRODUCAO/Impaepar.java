package INTRODUCAO;

import java.util.Scanner;

public class Impaepar {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);
		  System.out.println ("digite um numero inteiro: ");
		  num = leia.nextInt();
		  if (num == 0) {
			  System.out.println (num + "é neutro");
		  }
		  
		  else if (num % 2 ==0) {
		  }
		  
		  else {
			  
			  System.out.println( num +"é impar \n");
			  
		  }
	}	  
}		  
			  
			  
		