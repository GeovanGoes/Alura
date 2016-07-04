package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Orcamento;

public interface Desconto {
	BigDecimal desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
