import java.util.Calendar;


public class Pagamento {
	
	private String pagador;
	
	private Documento cnpjPagador;
	
	private double valor;
	
	private Calendar data;	
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getPagador() {
		return pagador;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public Documento getCnpjPagador() {
		return cnpjPagador;
	}
	public void setCnpjPagador(Documento cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
