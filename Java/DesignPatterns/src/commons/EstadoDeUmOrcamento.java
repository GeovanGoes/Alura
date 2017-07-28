package commons;

public interface EstadoDeUmOrcamento 
{
	void aplicaDescontoEstra(Orcamento orcamento);
	void aprova (Orcamento orcamento);
	void reprova (Orcamento orcamento);
	void finaliza (Orcamento orcamento);
}
