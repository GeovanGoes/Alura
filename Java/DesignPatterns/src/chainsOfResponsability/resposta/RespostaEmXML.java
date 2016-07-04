package chainsOfResponsability.resposta;

import commons.Conta;

public class RespostaEmXML implements Resposta {

	private Resposta resposta;
	
	public RespostaEmXML(Resposta proximaResposta) {
		resposta = proximaResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.XML)){
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>");
		}else if(resposta != null){
			resposta.responde(req, conta);
		}else{
			throw new RuntimeException("Formato de resposta não encontrado.");
		}
	}
}
