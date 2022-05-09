programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		// Declarando Variáveis
		real num1, num2, num3, num4, square1, square2, square3, square4

		// Entrada de dados
		escreva("Digite o primeiro número: ")
		leia(num1)

		escreva("Digite o primeiro número: ")
		leia(num2)

		escreva("Digite o primeiro número: ")
		leia(num3)

		escreva("Digite o primeiro número: ")
		leia(num4)

		// Calculando quadrado
		square1 = mat.potencia(num1, 2.00)
		square2 = mat.potencia(num2, 2.00)
		square3 = mat.potencia(num3, 2.00)
		square4 = mat.potencia(num4, 2.00)

		// Saida de dados
		se(square3 >= 1000){
			escreva("O quadrado do terceiro número é ",square3, " e é maior que 1000.\n")
			escreva("Acabou a brincadeira")
		} senao {
			escreva("Os quadrados dos numeros digitados são: ")
			escreva("\nO quadrado de ",num1," é ",square1,".")
			escreva("\nO quadrado de ",num2," é ",square2,".")
			escreva("\nO quadrado de ",num3," é ",square3,".")
			escreva("\nO quadrado de ",num4," é ",square4,".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 896; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */