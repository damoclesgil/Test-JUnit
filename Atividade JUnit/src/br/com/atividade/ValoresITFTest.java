package br.com.atividade;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ValoresITFTest {

	@Test
	public void inseriUmValor() {
		List<Integer> valores = new ArrayList<>();
		valores.add(2);
		valores.add(4);
		boolean retorno = ValoresITF.ins(valores);
		assertEquals(true, retorno);
	}

	@Test
	public void insereValor() {
		List<Integer> valores = new ArrayList<>();
		valores.add(2);
		valores.add(4);
		valores.add(2);
		valores.add(4);
		valores.add(2);
		valores.add(4);
		valores.add(2);
		valores.add(4);
		valores.add(2);
		valores.add(4);
		valores.add(2);
		boolean retorno = ValoresITF.ins(valores);
		assertEquals(false, retorno);
	}

	@Test
	public void removeValor() {
		List<Integer> valores = new ArrayList<>();
		int i = 2;
		valores.add(2);
		valores.add(4);
		valores.add(10);
		int retorno = ValoresITF.del(i, valores);
		assertEquals(10, retorno);
	}

	@Test
	public void removeValor() {
		List<Integer> valores = new ArrayList<>();
		int i = 2;
		int retorno = ValoresITF.del(i, valores);
		assertEquals(-1, retorno);
	}

	@Test
	public void tamanhoDaLista() { 
		List<Integer> valores = new ArrayList<>();
		valores.add(10);
		valores.add(1);
		int retorno = ValoresITF.size(valores);
		assertEquals(2, retorno);
	}

	@Test
	public void retornaMedia() {			
		List<Integer> valores = new ArrayList<>();
		valores.add(10);
		valores.add(10);
		valores.add(10);
		double retorno = ValoresITF.mean(valores);
		assertEquals(10.0, retorno);
	}

	@Test
	public void retornaListaVazia() { 
		List<Integer> valores = new ArrayList<>();
		double retorno = ValoresITF.mean(valores);
		assertEquals(0.0, retorno);
		;
	}

	@Test
	public void retornaMaiorValor() { 
		List<Integer> valores = new ArrayList<>();
		valores.add(30);
		valores.add(10);
		valores.add(50);
		valores.add(20);
		int retorno = ValoresITF.greater(valores);
		assertEquals(50, retorno);
	}

	@Test
	public void retornaMaiorValor() { 					
		List<Integer> valores = new ArrayList<>();
		int retorno = ValoresITF.greater(valores);
		assertEquals(-1, retorno);
	}

	@Test
	public void menorValor() { 
		List<Integer> valores = new ArrayList<>();
		valores.add(30);
		valores.add(10);
		valores.add(50);
		valores.add(20);
		int retorno = ValoresITF.lower(valores);
		assertEquals(10, retorno);

	}

	@Test
	public void retornaMenorValor() { 		
		List<Integer> valores = new ArrayList<>();
		int retorno = ValoresITF.lower(valores);
		assertEquals(-1, retorno);

	}
}
