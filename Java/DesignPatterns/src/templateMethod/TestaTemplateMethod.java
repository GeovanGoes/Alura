package templateMethod;

import java.math.BigDecimal;

import commons.Item;
import commons.Orcamento;
import strategy.impostos.CalculadorDeImposto;

public class TestaTemplateMethod {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"));
		orcamento.adicionaItem(new Item("Caneta", new BigDecimal("250")));
		orcamento.adicionaItem(new Item("Lapis", new BigDecimal("250")));
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.realizaCalculo(orcamento, new IKCV(new ICPP()));
	}
}
