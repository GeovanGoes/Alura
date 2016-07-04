package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Item;
import commons.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto desconto;

	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		if(existe("Lapis", orcamento) && existe("Caneta", orcamento)){
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}		
		return desconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.desconto = desconto;
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

}
