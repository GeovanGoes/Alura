package chainsOfResponsability.desconto;

import java.math.BigDecimal;

import commons.Item;
import commons.Orcamento;

public class TesteDescontos {
	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(new BigDecimal("500"));
		
		orcamento.adicionaItem(new Item("Caneta", new BigDecimal("250")));
		orcamento.adicionaItem(new Item("Lapis", new BigDecimal("250")));
		
		BigDecimal descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
