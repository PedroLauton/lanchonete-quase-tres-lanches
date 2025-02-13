package entidades;

import java.time.LocalDate;

abstract class Prato {
	
	private Double precoVenda;
	private LocalDate dataValidade;
	private Double peso;
	
	public Prato(Double precoVenda, LocalDate dataValidade, Double peso) {
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}

	public abstract void calcularPreco();
}
