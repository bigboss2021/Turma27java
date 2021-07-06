package aulasexemplos;

   import java.util.Scanner;

     public class condicional1 {
          
    	 public static void main(String[] args) {
    		 Scanner leia = new Scanner(System.in);
    		 int idade;
    		 String nome;
    		 
    		 System.out.printf("Diga sua idade:");
    		 idade= leia.nextInt();
    		 leia.nextLine();
    		 System.out.printf("\ndigite seu nome");
    		 nome = leia.nextLine();
    		 System.out.printf("\nSeu nome : %s" ,nome);
    		 System.out.printf("\nsua idade: %d" ,idade);
    		 
    		 if (idade>=18) {
    			 
    			 System.out.printf("\nvoce é maior de idade");
    		 
    		 }
    		 else if (idade>=1 && idade<18){
    			 
    			 System.out.printf("\nvoce não é maior de idade");
    		 }
    		 
    		 else {
    			 
    			 System.out.printf("\nvoce entrou com um dado errado");
    		 }
    	 }
    		 
     }	 
		




     
