package interpreterEvisitor;

public class ImpressoraVisitor implements Visitor 
{
	@Override
	public void visitaSoma(Soma soma)
	{
		System.out.print("(");
		
		Expressao ultima = soma.getExpressoes().get(soma.getExpressoes().size()-1);
		
		soma
		.getExpressoes()
		.forEach(s -> {
			s.aceita(this);
			if (!s.equals(ultima))
				System.out.print(" + ");
		});
		
		System.out.print(")");
	}
	
	
	@Override
	public void visitaSubtracao(Subtracao soma)
	{
		System.out.print("(");
		
		Expressao ultima = soma.getExpressoes().get(soma.getExpressoes().size()-1);
		
		soma
		.getExpressoes()
		.forEach(s -> {
			s.aceita(this);
			if (!s.equals(ultima))
				System.out.print(" - ");
		});
		
		System.out.print(")");
	}
	
	@Override
	public void visitaNumero(Numero numero)
	{
		System.out.print(numero.getNumero());
	}

	@Override
	public void visitaDivisao(Divisao soma)
	{
		System.out.print("(");
		
		Expressao ultima = soma.getExpressoes().get(soma.getExpressoes().size()-1);
		
		soma
		.getExpressoes()
		.forEach(s -> {
			s.aceita(this);
			if (!s.equals(ultima))
				System.out.print(" / ");
		});
		
		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao soma)
	{
		System.out.print("(");
		
		Expressao ultima = soma.getExpressoes().get(soma.getExpressoes().size()-1);
		
		soma
		.getExpressoes()
		.forEach(s -> {
			s.aceita(this);
			if (!s.equals(ultima))
				System.out.print(" * ");
		});
		
		System.out.print(")");
	}
	
	@Override
	public void visitaRaizQuadrada(RaizQuadrada soma)
	{
		System.out.print("(");
		
		soma.getExpressao().aceita(this);
			
		System.out.print(" √ ");
		
		System.out.print(")");
	}
	
	
}
