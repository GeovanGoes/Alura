package templateMethod;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional(Imposto imposto) 
	{
		super(imposto);
	}
	
	public TemplateDeImpostoCondicional() 
	{
	}
	
	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	public abstract BigDecimal minimaTaxacao(Orcamento orcamento);

	public abstract BigDecimal maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
