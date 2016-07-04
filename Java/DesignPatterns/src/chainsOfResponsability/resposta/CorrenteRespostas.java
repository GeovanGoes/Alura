package chainsOfResponsability.resposta;

import java.math.BigDecimal;

import commons.Conta;

public class CorrenteRespostas {
	public static void main(String[] args) {
		
		Resposta respostaEmPorcento = new RespostaEmPorcento(null);
		Resposta respostaEmCSV = new RespostaEmCSV(respostaEmPorcento);
		Resposta respostaEmXML = new RespostaEmXML(respostaEmCSV);
		
		respostaEmXML.responde(new Requisicao(Formato.XMLS), new Conta("Geovan", new BigDecimal("100")));
	}
}
