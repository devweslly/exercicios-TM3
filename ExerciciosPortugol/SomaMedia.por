programa
{
	
	funcao inicio()
	{	
		//Declarando variaveis
		inteiro soma = 0, num = 0, media = 0, cont = 0

		// Estrutura de Repeticao
		enquanto(num >= 0){
			escreva("Digite um número:  ")
			leia(num)

			// Fazendo Calculo
			cont++
			soma += num
		}
		
		// Arrumando valores
		soma++
		cont--
		media = soma/cont

		// Saida de dados
			escreva("\nSomatoria dos números é:  ", soma)
			escreva("\nA média dos números é:  ", media)
			escreva("\nO total de valores lidos é:  ", cont)
			escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */