package Exercios4Matriz;




public class Exercicio1 {
	
	public static void main (String args[]) {
		
	int pontuacao [] = new  int[5];	//duas variaveis inteiras
	int maiorPonto = 0;
	 
	for (int i=0; i<pontuacao.length; i++) { //regra
		
		pontuacao[i]=(int) Math.round(Math.random()*10); //ramdomico de numeros
		System.out.println(pontuacao[i]);
			if (pontuacao[i] > maiorPonto) {
				maiorPonto = pontuacao[i]; //resultado
			
			}
			
	  }   	
	
	}
}