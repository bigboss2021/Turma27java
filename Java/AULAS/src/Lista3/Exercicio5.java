package Lista3;

import java.util.Scanner;

public class Exercicio5 {


		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int num, soma = 0;  //variaveis
			
			do {
				System.out.println("Insira um número: ");
				num = leia.nextInt(); 
				soma+=num;
				
			} while(num != 0);
			
			System.out.println("Soma de números digitados até o número 0: "+soma);

		}

	

	}


