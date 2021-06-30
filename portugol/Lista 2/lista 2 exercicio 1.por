programa
{
	
	

	funcao inicio()
	{
		inteiro pesoTomates, exessoTomates, multa

		escreva("Quantos kgs de tomate você comprou? ")
		leia(pesoTomates)

		se (pesoTomates > 50){
			exessoTomates = (pesoTomates-50)
			multa = (exessoTomates*4)

			escreva("\nVocê ultrapassou ",exessoTomates," kgs do limite estabelecido")
			escreva("\nO valor da multa por excesso é: ",multa ," R$")
		} senao {
			escreva("Compra aprovada")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */