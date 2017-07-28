package commons;

import java.math.BigDecimal;

public class EmAprovacao implements EstadoDeUmOrcamento
{	
	public void aplicaDescontoEstra(Orcamento orcamento)
	{
		BigDecimal valorDesconto = orcamento.getValor().divide(new BigDecimal(100)).multiply(new BigDecimal("5"));
		orcamento.valor = orcamento.valor.subtract(valorDesconto);
	}

	@Override
	public void aprova(Orcamento orcamento) 
	{
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) 
	{
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) 
	{
		throw new RuntimeException("Orçamentos em aprovação nãoo podem ir direto para finalizado.");	
	}
}