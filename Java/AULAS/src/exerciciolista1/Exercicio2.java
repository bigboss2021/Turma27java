package exerciciolista1;

  import java.util.Scanner;

     public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		    int num, anos, meses, dias;
		 System.out.println("Oi, fale sua idade");
		    num = entrada.nextInt();
		    
		  anos = (num/365);
		  meses =(num%365)/30;
		  dias= (num %365)% 30;
		  
		System.out.println("Isso totaliza" +anos+ "anos" +meses+ "meses,e " + dias + "dias");  
		  
		    
		 
		

	}

}
