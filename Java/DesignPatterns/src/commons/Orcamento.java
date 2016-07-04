package commons;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private BigDecimal valor;
	private final List<Item> itens;

	public Orcamento (BigDecimal valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
	}	
	
	public BigDecimal getValor(){
		return this.valor;
	}

	public void adicionaItem(Item item){
		itens.add(item);
	}
	
	/**
	 * @return the itens
	 */
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	
	
}
