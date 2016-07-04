
public class GerenciadoraDeDividas {
	public void efetuaPagamento(Divida divida,String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		
			Pagamento pagamento = new Pagamento();
			CNPJ cnpj = new CNPJ(cnpjPagador);
			pagamento.setCnpjPagador(cnpj);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		
	}
}
