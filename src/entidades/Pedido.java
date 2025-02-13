package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String nomeCliente;
	private Double taxaServico;
	private List<Prato> itensConsumidos = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(String nomeCliente, Double taxaServico, List<Prato> itensConsumidos) {
		this.nomeCliente = nomeCliente;
		this.taxaServico = taxaServico;
		this.itensConsumidos = itensConsumidos;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public List<Prato> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(List<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}
}
