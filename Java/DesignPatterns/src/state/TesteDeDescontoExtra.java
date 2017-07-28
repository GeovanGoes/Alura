package state;

import java.math.BigDecimal;

import commons.Orcamento;

public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(new BigDecimal(500));
		reforma.aplicaDescontoExtra();
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		reforma.finaliza();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}
}
