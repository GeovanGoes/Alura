package observer;

import builder.ItemDaNota;
import builder.NotaFiscal;
import builder.NotaFiscalBuilder;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		/**Observer*/
		
		NotaFiscal constroi = builder
		.adicionaAcao(new EnviadorDeEmail())
		.adicionaAcao(new NotaFiscalDao())
		.adicionaAcao(new EnviadorSMS())
		.adicionaAcao(new Impressora())
		.paraEmpresa("minha empresa")
		.comCNPJ("1234")
		.com(new ItemDaNota("Buceta", 580))
		.com(new ItemDaNota("puta", 15400))
		.comObservacvoes("me chupa")
		.naDataAtual()
		.constroi();
		
		
		System.out.println(constroi.getValorBruto());
		
		
	}
}
