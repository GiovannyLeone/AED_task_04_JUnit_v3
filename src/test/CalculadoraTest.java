package test;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest extends Object {

    @Test
    void somaTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar 2");
    }

    @Test
    void subtracaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.subtracao(2.0, 1.0), "Deve resultar 1");
    }

    @Test
    void multiplicacaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(4.0, calc.multiplicacao(2.0, 2.0), "Deve resultar 4");
    }

    @Test
    void divisaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.divisao(2.0, 2.0), "Deve resultar 1");
    }

    @Test
    void potenciacaoTeste(){
        Calculadora calc = new Calculadora();
        assertEquals(4,calc.potenciacao(2.0, 2.0), "Deve resultar 4");
    }
}