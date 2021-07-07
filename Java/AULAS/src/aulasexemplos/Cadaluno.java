package aulasexemplos;

import java.util.Scanner;

public class Cadaluno {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//String alunos[] = new String[4]; //0..3 posiçoes, colocacao
		String alunos[] = {"JOAO","MARCOS","MARIA", "PEDRO"};
		
		//System.out.println(alunos[3]); //nao precisa add
		
		
		
		//for (int x=0; x<4;x++) { //regra a seguir for= para
		 for (int x=0; x<alunos.length; x++) {
			
			System.out.println(alunos[x]);
			   
		//for (String x : alunos) {
		     //System.out.println(x); //jeito mais clean de ler vetor 
		}
		
		}
				
		
		
		
		
		
		
		
}
