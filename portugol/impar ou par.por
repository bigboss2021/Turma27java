
	programa
{
	
	funcao inicio()
	{
		inteiro numero
		logico  par
		
		escreva("Digite um número\n")
		leia (numero)

		par= numero % 2 == 0
       

		se (numero % 2 == 0){
			escreva ("O número " + numero + " é par")
		}
		senao{
			escreva ("O número " + numero + " é impar")
		}
		escreva ("\nfim de programa")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */