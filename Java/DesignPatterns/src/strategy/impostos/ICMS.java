package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ICMS extends Imposto
{
	
	public ICMS(Imposto imposto) 
	{
		super(imposto);
	}
	
	
	public ICMS() {
	}


	@Override
	public BigDecimal calcula(Orcamento orcamento)
	{
		BigDecimal icms = orcamento.getValor().multiply(new BigDecimal("0.01")).add(calculaDoOutroImposto(orcamento));
		return icms;
	}
}
