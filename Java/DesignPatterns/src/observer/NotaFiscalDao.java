package observer;

import builder.NotaFiscal;

/**Observer*/
public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("salvei a nf");
	}
}
