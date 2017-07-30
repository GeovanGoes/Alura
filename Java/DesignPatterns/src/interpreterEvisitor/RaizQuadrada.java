package interpreterEvisitor;

public class RaizQuadrada implements Expressao{

	
	private Expressao expressao;

	public RaizQuadrada(Expressao expressoes)
	{
		this.expressao = expressoes;
		
	}
	
	@Override
	public double avalia() 
	{
		return Math.sqrt(expressao.avalia());
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaizQuadrada(this);	
	}
	
	public Expressao getExpressao() {
		return expressao;
	}

}
