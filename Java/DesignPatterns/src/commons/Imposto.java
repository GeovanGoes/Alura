package commons;

import java.math.BigDecimal;

public abstract class Imposto 
{
	private Imposto outroImposto;

	public Imposto(Imposto imposto) 
	{
		this.outroImposto = imposto;
	}
	
	public Imposto() {}
	
	public abstract BigDecimal calcula(Orcamento orcamento);
	
	protected BigDecimal calculaDoOutroImposto(Orcamento orcamento) 
	{
		if(outroImposto != null)
		{
			return outroImposto.calcula(orcamento);
		}
		return BigDecimal.ZERO;
	}
}
