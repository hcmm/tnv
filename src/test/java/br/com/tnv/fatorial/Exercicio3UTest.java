package br.com.tnv.fatorial;

import org.junit.Assert;
import org.junit.Test;

public class Exercicio3UTest {
	
	Integer fatorialEsperadoZero = 1;
	Integer fatorialEsperadoCinco = 120;
	Integer fatorialEsperadoSeis = 720;
	
	
	@Test
	public  void testaForialDeZero() {
		Integer fatorial = Fatorial.calcularFatorial(0);
		
		Assert.assertEquals(fatorialEsperadoZero, fatorial);
	}
	
	@Test
	public  void testaForialDeCinco() {
		Integer fatorial = Fatorial.calcularFatorial(5);
		
		Assert.assertEquals(fatorialEsperadoCinco, fatorial);
	}
	
	@Test
	public  void testaForialDeSeis() {
		Integer fatorial = Fatorial.calcularFatorial(6);
		
		Assert.assertEquals(fatorialEsperadoSeis, fatorial);
	}
}
