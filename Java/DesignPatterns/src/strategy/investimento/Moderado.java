package strategy.investimento;

import java.math.BigDecimal;
import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public BigDecimal investir(BigDecimal valorInvestimento) {
		boolean escolhido = new Random().nextDouble() > 0.50;
		return null;
	}

}
