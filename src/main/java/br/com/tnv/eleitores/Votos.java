package br.com.tnv.eleitores;

public class Votos {

	private Double totalEleitores;
	private Double validos;
	private Double votosBrancos;
	private Double votosNulos;
	
	public Votos() {
		// TODO Auto-generated constructor stub
	}
	
	public Votos(Double totalEleitores, Double validos, Double votosBrancos, Double votosNulos) {
		super();
		this.totalEleitores = totalEleitores;
		this.validos = validos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}
	public Double getTotalEleitores() {
		return totalEleitores;
	}
	public void setTotalEleitores(Double totalEleitores) {
		this.totalEleitores = totalEleitores;
	}
	public Double getValidos() {
		return validos;
	}
	public void setValidos(Double validos) {
		this.validos = validos;
	}
	public Double getVotosBrancos() {
		return votosBrancos;
	}
	public void setVotosBrancos(Double votosBrancos) {
		this.votosBrancos = votosBrancos;
	}
	public Double getVotosNulos() {
		return votosNulos;
	}
	public void setVotosNulos(Double votosNulos) {
		this.votosNulos = votosNulos;
	}
}
