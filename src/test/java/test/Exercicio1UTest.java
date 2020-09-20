package test;

import org.junit.Assert;
import org.junit.Test;

import br.com.tnv.eleitores.Totalizador;
import br.com.tnv.eleitores.Votos;

public class Exercicio1UTest {
	
	Double totalEsperado = 1000.0;
	Double validosEsperado = 800.0;
	Double brancosEsperado = 150.0;
	Double nulosEsperado = 50.0;
	
	Double percentualValidoEsperado = 80.0;
	Double percentualBrancoEsperado = 15.0;
	Double percentualNuloEsperado = 5.0;
	
	@Test
	public void deveTestarCriacaoDeVotos() {
		
		Votos votos = new Votos(1000.0, 800.0, 150.0, 50.0);
		Assert.assertEquals(totalEsperado, votos.getTotalEleitores());
		Assert.assertEquals(validosEsperado, votos.getValidos());
		Assert.assertEquals(nulosEsperado, votos.getVotosNulos());
		Assert.assertEquals(brancosEsperado, votos.getVotosBrancos());		
		
	}
	
	@Test
	public void deveTestarCriacaoDeTotalizador() {
		Votos votos = new Votos(1000.0, 800.0, 150.0, 50.0);
		
		Totalizador totalizador = new Totalizador(votos);
		
		Assert.assertEquals(totalEsperado, totalizador.getVotos().getTotalEleitores());
		Assert.assertEquals(validosEsperado, totalizador.getVotos().getValidos());
		Assert.assertEquals(nulosEsperado, totalizador.getVotos().getVotosNulos());
		Assert.assertEquals(brancosEsperado, totalizador.getVotos().getVotosBrancos());
	}
	
	@Test
	public void deveTestarPercentualVotosValidos() {
		Votos votos = new Votos(1000.0, 800.0, 150.0, 50.0);
		
		Totalizador totalizador = new Totalizador(votos);
		
		Double percentual = totalizador.getPercentualVotosValidos();
		
		Assert.assertEquals(percentualValidoEsperado, percentual);
		
		
	}
	
	@Test
	public void deveTestarPercentualVotosBrancos() {
		Votos votos = new Votos(1000.0, 800.0, 150.0, 50.0);
		
		Totalizador totalizador = new Totalizador(votos);
		
		Double percentual = totalizador.getPercentualVotosBrancos();
		
		Assert.assertEquals(percentualBrancoEsperado, percentual);
	}
	
	@Test
	public void deveTestarPercentualVotosNulos() {
		Votos votos = new Votos(1000.0, 800.0, 150.0, 50.0);
		
		Totalizador totalizador = new Totalizador(votos);
		
		Double percentual = totalizador.getPercentualVotosNulos();
		
		Assert.assertEquals(percentualNuloEsperado, percentual);
	}
	
}
