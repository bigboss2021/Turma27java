package Lista3;

import java.util.Scanner;

public class Exercicio2 {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //ler as fun�oes de leia
		int num, totPar = 0, totImpar = 0, totInvalido = 0; //varieavei inteiras
		
		for (int i = 1; i <= 10; i++) {    //para
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totPar++;
				} else {              //senao
					totImpar++;
				}
			} else {
				System.out.println("N�mero inv�lido.");
				totInvalido++;
			}
		}
		
		System.out.println("Total de n�meros pares: "+totPar);
		System.out.println("Total de n�meros �mpares: "+totImpar);
		System.out.println("Total de n�meros inv�lidos: "+totInvalido);

	}

}

