package observer;

import builder.NotaFiscal;

/**Observer*/
public class Impressora implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("imprimi a nf");
	}
}
