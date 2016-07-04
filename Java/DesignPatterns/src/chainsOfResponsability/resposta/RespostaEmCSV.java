package chainsOfResponsability.resposta;

import commons.Conta;

public class RespostaEmCSV implements Resposta {

	private Resposta resposta;
	
	public RespostaEmCSV(Resposta proximaResposta) {
		resposta = proximaResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.CSV)){
			System.out.println(conta.getTitular()+";"+conta.getSaldo());
		}else if(resposta != null){
			resposta.responde(req, conta);
		}else{
			throw new RuntimeException("Formato de resposta não encontrado.");
		}
	}
}
