package commons;


public class Reprovado implements EstadoDeUmOrcamento
{

	@Override
	public void aplicaDescontoEstra(Orcamento orcamento) 
	{
		throw new RuntimeException("O desconto s� � aplicado quando est� em aprova��o ou aprovado.");
	}

	@Override
	public void aprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) 
	{
		throw new RuntimeException("Or�amentos j� est� reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) 
	{
		orcamento.estadoAtual = new Finalizado();	
	}
	
}
