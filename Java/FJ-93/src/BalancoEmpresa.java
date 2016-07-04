import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	
	private Map<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
	public void registraDivida(String credor,String cnpjCredor, double valor){
		Divida divida = new Divida();
		CNPJ cnpj = new CNPJ();
		cnpj.setValor(cnpjCredor);
		divida.setDocumentoCredor(cnpj);
		divida.setCredor(credor);
		divida.setTotal(valor);
		dividas.put(divida.getDocumentoCredor(), divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador){
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null){
			Pagamento pagamento = new Pagamento();
			CNPJ cnpj = new CNPJ();
			cnpj.setValor(cnpjPagador);
			pagamento.setCnpjPagador(cnpj);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
}
