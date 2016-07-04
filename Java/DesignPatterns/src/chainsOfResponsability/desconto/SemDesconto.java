package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		return new BigDecimal("0");
	}

	@Override
	public void setProximo(Desconto desconto) {}

}
