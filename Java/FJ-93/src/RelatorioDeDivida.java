import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


public class RelatorioDeDivida {
	private final Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void gerarRelatorio(){
		System.out.println("CNPj Credor: " + divida.getDocumentoCredor());
		System.out.println("Credor: " + divida.getCredor());
		
		//NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		ProgramUtils.configureUtilsLocale(new Locale("en", "US"));
		System.out.println("Valor da dívida: "+ ProgramUtils.formatValueToReal(divida.getTotal()));
		System.out.println("Valor pago: "+ProgramUtils.formatValueToReal(divida.getValorPago()));
	}
	
	
	public static void main(String[] args) {
		Divida divida2 = new Divida();
		divida2.setCredor("Uma empresa");
		divida2.setTotal(1000);
		divida2.getCnpjCredor().setValor("00.000.002/0002-02");
		
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("00.000.002/0002-02");
		pagamento.setPagador("Outra empresa");
		pagamento.setValor(20);
		divida2.registra(pagamento);
		
		System.out.println("Meu teste em Real "+ProgramUtils.formatValueToReal(new BigDecimal("25000")));
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida2);
		relatorioDeDivida.gerarRelatorio();
	}
}
