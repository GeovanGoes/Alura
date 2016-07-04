package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{

	private Desconto desconto;

	public BigDecimal desconta(Orcamento orcamento){
		if(orcamento.getValor().compareTo(new BigDecimal("500")) == 1){
			return orcamento.getValor().multiply(new BigDecimal("0.07"));
		}		
		return desconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;		
	}
}
