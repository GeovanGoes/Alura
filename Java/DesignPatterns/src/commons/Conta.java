package commons;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
	
	private String titular;
	
	private BigDecimal saldo;
	
	private LocalDate aberturaConta;

	public Conta(String titular,BigDecimal saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta(String titular,BigDecimal saldo, LocalDate aberturaConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.aberturaConta = aberturaConta;
		
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

	public LocalDate getAberturaConta() {
		return aberturaConta;
	}

	public void setAberturaConta(LocalDate aberturaConta) {
		this.aberturaConta = aberturaConta;
	}
}