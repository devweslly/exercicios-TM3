programa
{
	
	funcao inicio()
	{
		// Declarando variáveis
		real codigo, numero, salario, hora, excedente, horaExced, salarioExced, salarioBase
		hora = 10.00
		horaExced = 20.00

		// Entrada de dados
		escreva("Informe a quantidade de horas trabalhadas:  ")
		leia(numero)

		// Calculo
		salario = numero * hora
		salarioBase = 50 * hora // Salario para quem trabalha mais de 50 horas
		excedente = numero - 50
		salarioExced = excedente * horaExced
		salarioBase += salarioExced

		// Saida de dados
		se(hora <= 50){
			escreva("O salário é: R$ ", salarioBase)
			escreva("\nO salário excedente é: R$ ", salarioExced)
		} senao se (hora > 50){
			escreva("O salário é: R$ ", salarioBase)
			escreva("\nO salário excedente é: R$ ", salarioExced)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */