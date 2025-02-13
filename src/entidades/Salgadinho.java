package entidades;

import java.time.LocalDate;

public class Salgadinho extends Prato{

	private String recheio;
	private String massa;
	
	public Salgadinho(Double precoVenda, LocalDate dataValidade, Double peso, String recheio, String massa) {
		super(precoVenda, dataValidade, peso);
		this.recheio = recheio;
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	@Override
	public void calcularPreco() {
		// TODO Auto-generated method stub
		
	}
}
