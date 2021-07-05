package exerciciolista1;

 import java.util.Scanner;

   public class Exercicios3 {

	public static void main(String[] args) {
		 int Num, Horas, Minutos, Segundos;
	 Scanner leia = new Scanner(System.in);
	    
	    System.out.println("Diga um numero e converteremos em horas, minutos e segundos: ");
	      Num = leia.nextInt();
	      
	        Horas = (Num/60); 
			Minutos = (Num % 60);
			Segundos = (Num % 60) % 60;  
			
		System.out.println("\nHoras" +Horas+ "\nMinutos"+Minutos+"\nSegundos" +Segundos);	
	      

	}

}
