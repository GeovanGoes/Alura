package commons;

import java.math.BigDecimal;

public class Conta {
	
	private String titular;
	
	private BigDecimal saldo;

	public Conta(String titular,BigDecimal saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	/**
	 * @return the saldo
	 */
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void deposita(BigDecimal valor){
		this.saldo.add(valor);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
