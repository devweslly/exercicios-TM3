programa
{
	// Convertendo velocidade
	funcao inicio()
	{

		// Declaração de variáveis
		cadeia nome
		inteiro velocidade

		// Saída de informações
		escreva("Olá, qual é seu nome?  ")
		leia(nome)

		escreva("\n")
		
		escreva("Prazer em te conhecer, ", nome, " =)\n")
		
		escreva("Posso te ajudar com algumas coisas de Física!\n")
		
		escreva("\n")
		
		escreva("Vamos fazer a conversão de velocidade em km/h para metros por segundo.\n")

		escreva("Nos diga a velocidade em km/h:   ")
		leia(velocidade)

		escreva("\n")

		// Convertendo velocidade
		real veloConvert = velocidade / 3.6

		escreva("A velocidade ", velocidade , " km/h em metros por segundo é " , veloConvert , " m/s.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */