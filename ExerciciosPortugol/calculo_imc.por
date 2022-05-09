programa
{

	inclua biblioteca Matematica --> mat

	// Calculo do IMC
	funcao inicio()
	{
		//Declarando variáveis
		cadeia nome
		real peso, altura, imc

		// Leitura de dados
		escreva("Olá, qual o seu nome? \n")
		leia(nome)

		escreva(nome, ", informe seu peso:  ")
		leia(peso)

		escreva("Agora informe sua altura:  ")
		leia(altura)

		// Calculando IMC (Formula)
		imc = peso / (altura*altura)

		escreva("\n" , nome , ", seu IMC é " , mat.arredondar(imc, 2) , " kg/m2.\n")

		// Estrutura condisional
		se(imc <= 16){
			
			escreva("E você está como Subpeso Severo. Bora comer tudo o que ter pela frente!")
			
		} senao se(imc <= 19.9){
				
			escreva("E você está como Subpeso. Bora começar comer mais!")

		} senao se(imc <= 24.9){
				
			escreva("E você está como Normal. Mantenha-se assim =)")

		} senao se(imc <= 29.9){
				
			escreva("E você está como Sobrepeso. Bora fechar a boca!")

		} senao se(imc <= 39.9){
				
			escreva("E você está como Obeso. Vamos comer menos e fazer mais exercícios físicos")

		} senao se(imc >= 40.0){
				
			escreva("E você está como Obeso Mórbido. Bora fazer uma dieta e fazer atividades físicas")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1079; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */