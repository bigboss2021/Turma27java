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
                System.out.println("\nVocê ultrapassou" +exessoTomates+" kgs do limite estabelecido");
              multa = (exessoTomates*4);
              
              
              
        	   
        	   
           
           }
        
		
	}


/*funcao inicio()
{
	inteiro pesoTomates, exessoTomates, multa

	escreva("Quantos kgs de tomate você comprou? ")
	leia(pesoTomates)

	se (pesoTomates > 50){
		exessoTomates = (pesoTomates-50)
		multa = (exessoTomates*4)

		escreva("\nVocê ultrapassou ",exessoTomates," kgs do limite estabelecido")
		escreva("\nO valor da multa por excesso é: ",multa ," R$")
	} senao {
		escreva("Compra aprovada")
	}
