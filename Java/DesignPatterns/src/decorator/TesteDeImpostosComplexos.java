package decorator;
import commons.Orcamento;

import java.math.BigDecimal;

import strategy.impostos.ICCC;
import strategy.impostos.ISS;

/**
 * Decorator, encadeia um imposto no outro criando impostos complexos
 * Juntar comportamentos que estão em classes diferentes sem criar uma nova classe para cada variação 
 * */
public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		ISS iss = new ISS(new ICCC());
		
		Orcamento orcamento = new Orcamento(new BigDecimal(500));
		
		BigDecimal calcula = iss.calcula(orcamento);
		
		System.out.println(calcula);
	}
}
