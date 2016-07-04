package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ISS implements Imposto{
	
	@Override
	public BigDecimal calcula(Orcamento orcamento){
		BigDecimal iss = orcamento.getValor().multiply(new BigDecimal("0.6"));
		return iss;
	}
}
