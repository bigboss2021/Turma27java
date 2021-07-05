package exerciciolista1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args){
    	   Scanner entrada= new Scanner(System.in);
    	   int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotal;
    	   
    	   System.out.print("Calcule sua idade em dias\n\n");
    	   
    	   
    	   System.out.print("Digite sua idade: ");
    	   IdadeAnos = entrada.nextInt();
    	   
    	   
    	   System.out.print("Digite os meses: ");
    	   IdadeMeses = entrada.nextInt();
    	   
    	   
    	   System.out.print("Digite os dias: ");
    	   IdadeDias = entrada.nextInt();
    	   
    	   IdadeTotal = (IdadeAnos*365 + IdadeMeses * IdadeDias);
    	   System.out.print(IdadeTotal);
        
       }
		
		
	
	 
	{
	
	System.out.println("sua idade total é ");
	
	}
	
}
