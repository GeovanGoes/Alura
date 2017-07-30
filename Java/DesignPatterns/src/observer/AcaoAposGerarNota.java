package observer;

import builder.NotaFiscal;

/**Observer*/
public interface AcaoAposGerarNota {
	void executa(NotaFiscal nf);
}
