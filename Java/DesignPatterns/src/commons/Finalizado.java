package commons;

public class Finalizado implements EstadoDeUmOrcamento
{
	@Override
	public void aplicaDescontoEstra(Orcamento orcamento) 
	{
		throw new RuntimeException("O desconto só é aplicado quando está em aprovação ou aprovado.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado.");	
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado.");
	}
}
 	