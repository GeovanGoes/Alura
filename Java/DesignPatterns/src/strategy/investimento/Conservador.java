package strategy.investimento;

import java.math.BigDecimal;

public class Conservador implements Investimento{

	@Override
	public BigDecimal investir(BigDecimal valorInvestimento) {
		return valorInvestimento.multiply(new BigDecimal("0.8"));
	}

}
