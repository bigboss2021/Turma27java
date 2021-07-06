package Lista3;

import java.util.Scanner;

public class Exercicio2 {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //ler as funçoes de leia
		int num, totPar = 0, totImpar = 0, totInvalido = 0; //varieavei inteiras
		
		for (int i = 1; i <= 10; i++) {    //para
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totPar++;
				} else {              //senao
					totImpar++;
				}
			} else {
				System.out.println("Número inválido.");
				totInvalido++;
			}
		}
		
		System.out.println("Total de números pares: "+totPar);
		System.out.println("Total de números ímpares: "+totImpar);
		System.out.println("Total de números inválidos: "+totInvalido);

	}

}

