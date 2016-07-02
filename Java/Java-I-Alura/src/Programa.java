
public class Programa {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numero = 123;
		conta.saldo = 400;
		conta.titular = "Geovan";
		conta.agencia = 876;
		
		conta.deposita(100);
		conta.saca(5);
		
		
		System.out.println(conta.saldo);
		
		
	}
}
