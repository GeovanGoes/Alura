package commons;

import java.math.BigDecimal;

public class Aprovado implements EstadoDeUmOrcamento
{
	public void aplicaDescontoEstra(Orcamento orcamento)
	{
		BigDecimal valorDesconto = orcamento.getValor().divide(new BigDecimal(100)).multiply(new BigDecimal("2"));
		orcamento.valor = orcamento.valor.subtract(valorDesconto);
	}

	@Override
	public void aprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Or�amento j� est� aprovado.");
	}

	@Override
	public void reprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Or�amentos aprovados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) 
	{
		orcamento.estadoAtual = new Finalizado();
	}
}