programa
{
	
	funcao inicio()
	{
		// Declarando Variáveis
		inteiro num, divisao

		// Entrada de dados
		escreva("Digite um número inteiro:  ")
		leia(num)

		// Verificando se é par
		divisao = num % 2

		// Saida de dados
		se(divisao == 0 e num > 0){
			escreva("O número ",num," é par e positivo!")
		} senao se (divisao == 0 e num < 0){
			escreva("O número ",num," é par e negativo!")
		} senao se (divisao != 0 e num > 0){
			escreva("O número ",num," é impar e positivo!")
		} senao se (divisao != 0 e num < 0){
			escreva("O número ",num," é impar e negativo!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */