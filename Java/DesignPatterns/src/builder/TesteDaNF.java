package builder;


public class TesteDaNF 
{
	public static void main(String[] args) 
	{
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("empresa tal")
		.comCNPJ("3456789")
		.com(new ItemDaNota("buceta", 500))
		.com(new ItemDaNota("item 2", 300))		
		.com(new ItemDaNota("item 3", 400))
		.comObservacvoes("me chupa")
		.naDataAtual();
		
		NotaFiscal nota = builder.constroi();
		
		System.out.println(nota.getValorBruto());
		
	}
}
