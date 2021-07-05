package exerciciolista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int custo, custoFabrica;
       Scanner leia = new Scanner (System.in);
	
	System.out.println("Custo de fabrica de um veículo? ");
	    custoFabrica = leia.nextInt();
	  custo = custoFabrica + ((custoFabrica*28)/100) + ((custoFabrica*45)/100);
	  
	  System.out.println("Custo da fabrica é : "+custo);
	   
			   
		
      
		
	}

}
