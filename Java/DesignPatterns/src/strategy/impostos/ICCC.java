package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ICCC implements Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal result = null;
		if(orcamento.getValor().compareTo(new BigDecimal("1000")) == -1){
			result = orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		else if(orcamento.getValor().compareTo(new BigDecimal("3000")) == 0 
			|| orcamento.getValor().compareTo(new BigDecimal("3000")) == -1){
			result = orcamento.getValor().multiply(new BigDecimal("0.07"));
		}
		else{
			result = orcamento.getValor().multiply(new BigDecimal("0.08")).add(new BigDecimal("30"));
		}
		
		return result;
	}

}
