package commons;

public class Finalizado implements EstadoDeUmOrcamento
{
	@Override
	public void aplicaDescontoEstra(Orcamento orcamento) 
	{
		throw new RuntimeException("O desconto s� � aplicado quando est� em aprova��o ou aprovado.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos j� est� finalizado.");	
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos j� est� finalizado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos j� est� finalizado.");
	}
}
 	