package strategy.impostos;

import java.math.BigDecimal;

import commons.Imposto;
import commons.Orcamento;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		BigDecimal icms = imposto.calcula(orcamento);
		System.out.println(icms);
	}
}
