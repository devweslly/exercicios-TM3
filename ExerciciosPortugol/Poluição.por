programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Indique o indice de puluição:  ")
		leia(indice)

		se(indice < 0.3){
			escreva("Nível de popuição aceitável. Não parar as atividades de nenhum grupo")
		}senao se(indice >=0.3 e indice <= 0.39){
			escreva("Parar as atividades do Grupo 1")
		}senao se(indice >=0.4 e indice <= 0.49){
			escreva("Parar as atividades dos Grupos 1 e 2")
		}senao se(indice >=0.5){
			escreva("Parar as atividades de todos os Grupos 1, 2 e 3")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */