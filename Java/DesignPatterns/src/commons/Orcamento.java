package commons;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected BigDecimal valor;
	private final List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento (BigDecimal valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
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

	public void aplicaDescontoExtra() 
	{
		estadoAtual.aplicaDescontoEstra(this);
	}
	
	public void aprova ()
	{
		estadoAtual.aprova(this);
	}
	
	public void reprova ()
	{
		estadoAtual.reprova(this);
	}
	
	public void finaliza ()
	{
		estadoAtual.finaliza(this);
	}
}
