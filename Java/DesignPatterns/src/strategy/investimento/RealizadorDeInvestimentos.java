package strategy.investimento;

import java.math.BigDecimal;

import commons.Conta;

public class RealizadorDeInvestimentos {
	
		public void realizarInvestimento(Conta conta, Investimento investimento){
			conta.deposita(investimento.investir(conta.getSaldo()).multiply(new BigDecimal("0.75")));
			System.out.println(conta.getSaldo());
		}
}
