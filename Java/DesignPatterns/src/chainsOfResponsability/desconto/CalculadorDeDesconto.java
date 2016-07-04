package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Orcamento;

public class CalculadorDeDesconto {
	public BigDecimal calcula(Orcamento orcamento){
		Desconto descontoPorCincoItens = new DescontoPorCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		descontoPorCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(descontoPorVendaCasada);
		descontoPorVendaCasada.setProximo(semDesconto);
		
		return descontoPorCincoItens.desconta(orcamento);
	}
}

