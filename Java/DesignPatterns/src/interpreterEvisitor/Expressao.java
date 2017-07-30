package interpreterEvisitor;

public interface Expressao 
{
	double avalia();
	
	void aceita(Visitor impressora);
}
