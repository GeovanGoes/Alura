package templateMethod;

import java.math.BigDecimal;

import commons.Item;
import commons.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor().compareTo(new BigDecimal("100")) == 1){
				return true;
			}
		}
		return false;
	}

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) == 1 && temItemMaiorQueCemReais(orcamento);
	}

}
