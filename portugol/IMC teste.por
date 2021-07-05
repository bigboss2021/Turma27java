programa
{
	
	funcao inicio()
	{
	   real m, a , imc 
	   

	  escreva ("digite seu peso em (kilo)")
	  leia(m)
	   	limpa()

	  escreva ("digite sua altura em (metros)")
	  leia(a)

         	limpa()
       imc = (m / (a*a))

       escreva ( "seu imc:", imc )
         se (imc >= 18.5 e imc < 25)
       escreva("seu peso esta ideal")
         senao 
       escreva(" vai malhar!!")  
         

      
	  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */