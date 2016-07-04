package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Orcamento;

public class DescontoPorCincoItens implements Desconto{
	
	private Desconto desconto;

	public BigDecimal desconta(Orcamento orcamento){
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}		
		return desconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;		
	}
}
