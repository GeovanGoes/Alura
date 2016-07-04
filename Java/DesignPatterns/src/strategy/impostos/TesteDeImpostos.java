package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class TesteDeImpostos {
	public static void main(String[] args) {
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(new BigDecimal("500"));
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, icms);
		
		Orcamento orcamentoReforma = new Orcamento(new BigDecimal("5000"));
		
		Imposto iccc = new ICCC();
		calculadorDeImposto.realizaCalculo(orcamentoReforma, iccc);
	}
}
