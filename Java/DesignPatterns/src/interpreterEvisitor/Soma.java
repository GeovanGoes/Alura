package interpreterEvisitor;

import java.util.List;

public class Soma implements Expressao 
{
	private List<Expressao> expressoes;

	public Soma(List<Expressao> expressoes)
	{
		this.expressoes = expressoes;
		
	}

	@Override
	public double avalia() 
	{
		return expressoes.stream().mapToDouble(Expressao::avalia).sum();
	}
	
	public List<Expressao> getExpressoes() 
	{
		return expressoes;
	}

	@Override
	public void aceita(Visitor impressora) 
	{
		impressora.visitaSoma(this);
	}
}
