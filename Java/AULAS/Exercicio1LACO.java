package exerciciolista1;

import java.util.Scanner;

public class Exercicio1LACO {

	public static void main(String[] args) {
      int pesoTomates, exessoTomates, multa;
        
         Scanner leia =  new Scanner(System.in);
             System.out.println("Quantos Kgs de tomate?");
                 pesoTomates = leia.nextInt();
                  
           if (pesoTomates > 50);
              exessoTomates = (pesoTomates-50);
                System.out.println("\nVoc� ultrapassou" +exessoTomates+" kgs do limite estabelecido");
              multa = (exessoTomates*4);
              
              
              
        	   
        	   
           
           }
        
		
	}


/*funcao inicio()
{
	inteiro pesoTomates, exessoTomates, multa

	escreva("Quantos kgs de tomate voc� comprou? ")
	leia(pesoTomates)

	se (pesoTomates > 50){
		exessoTomates = (pesoTomates-50)
		multa = (exessoTomates*4)

		escreva("\nVoc� ultrapassou ",exessoTomates," kgs do limite estabelecido")
		escreva("\nO valor da multa por excesso �: ",multa ," R$")
	} senao {
		escreva("Compra aprovada")
	}
