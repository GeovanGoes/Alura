package interpreterEvisitor;

public class Numero implements Expressao
{
	
	
	private double numero;

	public Numero(double numero) 
	{
		this.numero = numero;
	}

	@Override
	public double avalia()
	{
		return numero;
	}

	public double getNumero() 
	{
		return numero;
	}

	@Override
	public void aceita(Visitor impressora) 
	{
		impressora.visitaNumero(this);
	}
}
