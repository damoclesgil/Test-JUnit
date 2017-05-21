package br.senac.br.aqs.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.senac.br.aqs.Calculadora;

public class CalculadoraTest {
	Calculadora sony;
	
	@Before
	public void iniciarCalculadora(){
		sony = new Calculadora();
	}
	
	@Test
	public void verificarSomaDoisNumerosPares() {
		assertEquals(14, sony.soma(10, 4));
	}
	@Test
	public void verificarSomaDoisNumerosImpares() {
		assertEquals(22, sony.soma(9, 13));
	}
	
	
	
	@Test
	public void verificarSubtracaoDoisNumerosPositivos() {
		assertEquals(7, sony.subtrair(10, 3));
	}
	@Test
	public void verificarSubtracaoDoisNumerosNegativos() {
		assertEquals(-7, sony.subtrair(-10, -3));
	}
	
	@Test
	public void verificarDivisaoDoisNumeroPares() {
		assertEquals(5,sony.divisao(10, 2),0);
	}
	@Test
	public void verificarDivisaoComNumerosImpares() {
		assertEquals(4.5, sony.divisao(9, 2), 0);
	}
	@Test
	public void verificarDivisaoComNumerosImparesDisma() {
		assertEquals(3.333, sony.divisao(10, 3), 0.001);
	}
	
	

	@Test
	public void verificarMultiplicacao() {
		assertEquals(-21, sony.multiplicacao(7, -3));
	}
	
	
	@Test
	public void verificarPotencia() {
		assertEquals(81, sony.exponenciacao(3, 4),0);
	}
	@Test
	public void verificarFatorial2() {
		assertEquals(720, sony.fatorial(6));
	}
	

	
	
	
	
	
}
