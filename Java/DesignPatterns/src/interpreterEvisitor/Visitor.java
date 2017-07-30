package interpreterEvisitor;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao soma);

	void visitaNumero(Numero numero);

	void visitaDivisao(Divisao soma);

	void visitaMultiplicacao(Multiplicacao soma);

	void visitaRaizQuadrada(RaizQuadrada soma);

}