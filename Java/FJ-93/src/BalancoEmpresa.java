import java.util.HashMap;
import java.util.Map;


public class BalancoEmpresa {
	
	private Map<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
	public void registraDivida(String credor,String cnpjCredor, double valor){
		Divida divida = new Divida();
		divida.setDocumentoCredor(new CNPJ().setValor(cnpjCredor));
		divida.setCredor(credor);
		divida.setTotal(valor);
		dividas.put(divida.getDocumentoCredor(), divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador){
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null){
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
}
