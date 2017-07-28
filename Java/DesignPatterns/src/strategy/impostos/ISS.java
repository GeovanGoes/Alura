package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class ISS extends Imposto
{

	public ISS(Imposto imposto) 
	{
		super(imposto);
	}
	
	public ISS() {
	}

	@Override
	public BigDecimal calcula(Orcamento orcamento)
	{
		BigDecimal iss = orcamento.getValor().multiply(new BigDecimal("0.06")).add(calculaDoOutroImposto(orcamento));
		return iss;
	}
}
