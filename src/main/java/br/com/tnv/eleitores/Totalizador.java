package br.com.tnv.eleitores;

public class Totalizador {
	
	private Votos votos;

	public Totalizador(Votos votos) {
		super();
		this.votos = votos;
	}
	public Totalizador() {
		// TODO Auto-generated constructor stub
	}
	
	public Double getPercentualVotosValidos() {
		Double fator = this.votos.getValidos() / this.votos.getTotalEleitores(); 
		
		return fator * 100;
	}
	
	public Double getPercentualVotosBrancos() {
		Double fator = (double) (this.votos.getVotosBrancos() / this.votos.getTotalEleitores()); 
		
		return fator * 100;
	}
	
	public Double getPercentualVotosNulos() {
		Double fator = (double) (this.votos.getVotosNulos() / this.votos.getTotalEleitores()); 
		
		return fator * 100;
	}
	public Votos getVotos() {
		return votos;
	}
	public void setVotos(Votos votos) {
		this.votos = votos;
	}
	
	
	

}
