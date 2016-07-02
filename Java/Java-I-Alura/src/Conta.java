
public class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;
	
	void deposita(double valor){
		this.saldo += valor;
	}
	
	void saca (double valor){
		if (this.saldo >= valor){
			this.saldo -= valor;
		}
	}
	
	void transfere(double valor, Conta destino){
		this.saca(valor);
		destino.deposita(valor);
	}
}
