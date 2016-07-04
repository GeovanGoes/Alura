package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ICMS implements Imposto{
	@Override
	public BigDecimal calcula(Orcamento orcamento){
		BigDecimal icms = orcamento.getValor().multiply(new BigDecimal("0.1"));
		return icms;
	}
}
