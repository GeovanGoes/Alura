package commons;

import java.math.BigDecimal;

public class Item {
	
	private String nome;
	private BigDecimal valor;

	public Item(String nome, BigDecimal valor){
		this.nome = nome;
		this.valor = valor;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	
	
}
