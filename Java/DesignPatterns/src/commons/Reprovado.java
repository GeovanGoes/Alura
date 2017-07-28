package commons;


public class Reprovado implements EstadoDeUmOrcamento
{

	@Override
	public void aplicaDescontoEstra(Orcamento orcamento) 
	{
		throw new RuntimeException("O desconto só é aplicado quando está em aprovação ou aprovado.");
	}

	@Override
	public void aprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Orçamentos já está reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) 
	{
		orcamento.estadoAtual = new Finalizado();	
	}
	
}
