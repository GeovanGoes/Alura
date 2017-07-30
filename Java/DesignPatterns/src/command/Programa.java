package command;

public class Programa {
	public static void main(String[] args) {
		Pedido pedido = new Pedido("Geovan", 5000);
		Pedido pedido2 = new Pedido("Marcela", 2000);
		
		FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();
		filaDeTrabalho.adiciona(new PagaPedido(pedido));
		
		filaDeTrabalho.adiciona(new PagaPedido(pedido2));
		
		filaDeTrabalho.adiciona(new ConcluiPedido(pedido));
		
		filaDeTrabalho.processa();
	}
}
