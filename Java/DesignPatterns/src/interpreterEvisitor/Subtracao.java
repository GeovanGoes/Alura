package interpreterEvisitor;

import java.util.List;

public class Subtracao implements Expressao 
{
	private List<Expressao> expressoes;

	public Subtracao(List<Expressao> expressoes)
	{
		this.expressoes = expressoes;
		
	}

	@Override
	public double avalia() 
	{
		double resultado = Double.NEGATIVE_INFINITY;
		
		if (expressoes.size() == 0) return 0;
		
		for (Expressao expressao : expressoes) 
		{
			if (resultado == Double.NEGATIVE_INFINITY)
			{
				resultado = expressao.avalia();
			}
			else
			{
				resultado = resultado - expressao.avalia();
			}
		}
		return resultado;
	}
	
	public List<Expressao> getExpressoes() 
	{
		return expressoes;
	}

	@Override
	public void aceita(Visitor impressora) 
	{
		impressora.visitaSubtracao(this);
	}
}
