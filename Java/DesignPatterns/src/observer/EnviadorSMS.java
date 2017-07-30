package observer;

import builder.NotaFiscal;

/**Observer*/
public class EnviadorSMS implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por sms a nf");
	}
}
