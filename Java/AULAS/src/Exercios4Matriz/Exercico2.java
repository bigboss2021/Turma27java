package Exercios4Matriz;

public class Exercico2 {

	public static void main(String[] args) {
				
		int soma=0, maiorX=0, maior=0; //valores inteirps
		int dado[] = new int [10]; //vetor 
		
		for(int i = 0; i < dado.length; i++) { //length para ler as posiçoes do vetor
			dado[i]=(int) Math.round(Math.random()*10); //cauculo ramdomico
			System.out.println("Valor lançado: "+dado[i]); 
			
			soma+=dado[i];
			
			if (dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		
		for(int i = 0; i < dado.length; i++) {
			if (dado[i] == maior) {
				maiorX++;
			}
		}
		
		System.out.println("Média de dados lançados: "+(soma/dado.length));
		System.out.println(" Maior valor lançado foi "+maior+", que ocorreu "+maiorX+" vezes.");
		
		
		
		
		

	}

}

