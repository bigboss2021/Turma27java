programa
{
	
	funcao inicio()
	{
         inteiro d 
	    real valor
	    
		escreva("\n--------------------------------------------------")
          escreva("\n---------------Me doe dinheiro--------------------")
          escreva("\n--------------------------------------------------")
          escreva("\n-----------muito obrigado por doar----------------")
          escreva( "\n[1] para doar 10 reais ")
          escreva( "\n[2] para doar 20 reais ")
          escreva( "\n[3] para doar 30 reais ")
          escreva( "\n[4] para doar  outros valores  ")
          escreva( "\n[5] para cancelar ")
          
          leia (d)
          
          escolha(d){
                 caso 1:
                      valor=10 
                 caso 2:
                      valor=20
                 caso 3:
                      valor=30
                 caso 4:
                      
                      escreva( "qual o valor que deseja doar? R$")
                      leia(valor)
                      
                 caso 5:
                      valor = 0 
                      escreva ("Sua doação foi de ",valor ,"muito obrigado")

          }   
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */