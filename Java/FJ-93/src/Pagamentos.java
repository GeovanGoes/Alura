import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


public class Pagamentos extends ArrayList<Pagamento>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6666483788652761747L;
	
	private double valorPago;
	
	private void paga(double valor) {
		if(valor < 0){
			throw new IllegalArgumentException("Valor inválido para o pagamento.");
		}
		if(valor > 100){
			valor = valor - 8;
		}
		setValorPago(getValorPago() + valor);
	}
	
	public void registra(Pagamento pagamento){
		this.add(pagamento);
		paga(pagamento.getValor());
	}

	public Collection<Pagamento> pagamentosAntesDe(Calendar data){
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public Collection<Pagamento> pagamentosComValorMaiorQue(double valor){
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getValor() > valor){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public Collection<Pagamento> pagamentosDo(String cnpjPagador){
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getCnpjPagador().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}
