package testCalculadora

import junit.framework.TestCase.assertEquals
import org.junit.Test


internal class CalculadoraTeste {

    // @Test - indicar que a função vai executar um teste unitário
    @Test
    fun somaTest() {
        // asserts - Vão verificar o que o método precisa retornar
        // para o teste ser validado
        // Nós vamos verificar se caso a gente chamar a soma e passar
        // os parâmetros 7.0 e 4.0, se ele retorna 11
        // assertEquals(valor esperado, método que será executado)
        assertEquals(11.0, Calculadora.soma(7.0, 4.0))
    }

    @Test
    fun multTest(){
        assertEquals(15.0, Calculadora.mult(5.0, 3.0))
    }
}