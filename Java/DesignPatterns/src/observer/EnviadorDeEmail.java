package observer;

import builder.NotaFiscal;

/**Observer*/
public class EnviadorDeEmail implements AcaoAposGerarNota
{
	
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email a nf");
	}

}
