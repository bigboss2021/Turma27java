programa
{  //Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
   //e o escreva em seguida. 
   //Encontre após a maior pontuação e a apresente
	
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao = 0 

		para(inteiro i=0; i <5; i++){ //sempre colocar
			escreva("\n Insira a "+(i+1)+"aluno pontuação: ")
			leia(pontuacao[i])

			se (pontuacao[i] > maiorPontuacao){
				maiorPontuacao = pontuacao[i]
			}
		}

		
		
		para(inteiro i=0; i <5; i++){
			escreva("\n"+(i+1)+"aluno pontuação: "+pontuacao[i])
		}

	   escreva("\n A maior pontuação foi: "+maiorPontuacao )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */