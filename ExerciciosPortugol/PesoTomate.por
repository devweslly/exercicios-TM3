programa
{
	
	funcao inicio()
	{
		// Declarando as variaveis
		real peso, excesso, multa

		// Entrada de dados
		escreva("Informe o peso do tomate:  ")
		leia(peso)
		
		// Calculando multa
		excesso = peso - 50
		multa = excesso*4.0
		
		// Mostrando dados
		se(peso <= 50){
			escreva("Você não irá pagar multa =)")
		} senao se(peso > 50){
			escreva("Você ultrapssou a quantidade de peso.\n")
			escreva("Você precisa pagar: R$ ", multa)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */