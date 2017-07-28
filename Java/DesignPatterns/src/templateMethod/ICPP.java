package templateMethod;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional
{
	
	public ICPP(Imposto imposto) 
	{
		super(imposto);
	}
	
	public ICPP() {}

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05")).add(calculaDoOutroImposto(orcamento));
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.07")).add(calculaDoOutroImposto(orcamento));
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) == 1;
	}
	
}
