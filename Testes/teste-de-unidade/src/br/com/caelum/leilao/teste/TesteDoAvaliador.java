package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TesteDoAvaliador {
	
	private Avaliador avaliador;
	private Usuario jose;
	private Usuario maria;
	private Usuario joao;

	@Before
	public void criaValiador(){
		this.avaliador = new Avaliador();
		this.joao = new Usuario("Joao");
		this.maria = new Usuario("Maria");
		this.jose = new Usuario("Jose");
	}
	
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 novo")
				.lance(joao, 250)
				.lance(jose, 300)
				.lance(maria, 400)
				.constroi();
		
		avaliador.avalia(leilao);
		
		//assertEquals(400, avaliador.getMaiorLance(), 0.00001);
		//assertEquals(250, avaliador.getMenorLance(), 0.00001);
		
		assertThat(avaliador.getMaiorLance(), equalTo(400));
		assertThat(avaliador.getMenorLance(), equalTo(250));
	}
	
	@Test
	public void deveEntenderLeilaoComApenasUmLance(){
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 novo")
		.lance(joao, 1000)
		.constroi();
				
		avaliador.avalia(leilao);
		assertEquals(1000, avaliador.getMaiorLance(), 0.00001);
		assertEquals(1000, avaliador.getMenorLance(), 0.00001);
	}

	@Test
	public void deveEncontrarOsTresMaioresLances(){		
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 novo")
				.lance(joao, 100)
				.lance(maria, 200)
				.lance(joao, 300)
				.lance(maria, 400)
				.constroi();
		
		avaliador.avalia(leilao);
		
		List <Lance> maiores = avaliador.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.00001);
		assertEquals(300, maiores.get(1).getValor(), 0.00001);
		assertEquals(200, maiores.get(2).getValor(), 0.00001);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado(){
			Leilao leilao = new CriadorDeLeilao().para("Play 3").constroi();
			avaliador.avalia(leilao);
	}
}
