package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ImpostoMuitoAlto extends Imposto
{
	
	public ImpostoMuitoAlto(Imposto imposto) 
	{
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {}

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.20")).add(calculaDoOutroImposto(orcamento));
	}

}
