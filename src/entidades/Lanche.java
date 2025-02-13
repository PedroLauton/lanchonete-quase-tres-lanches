package entidades;

import java.time.LocalDate;

public class Lanche extends Prato{
	
	private String pao;
	private String recheio;
	private String molho;
	
	public Lanche(Double precoVenda, LocalDate dataValidade, Double peso, String pao, String recheio, String molho) {
		super(precoVenda, dataValidade, peso);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	@Override
	public void calcularPreco() {
		// TODO Auto-generated method stub
		
	}
}
