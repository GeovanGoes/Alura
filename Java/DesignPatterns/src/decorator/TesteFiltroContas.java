package decorator;

import commons.Conta;
import commons.Filtro;
import decorator.filtros.AberturaNoMesCorrente;
import decorator.filtros.MaiorQueQuinhentos;
import decorator.filtros.MenorQueCem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteFiltroContas {
	public static void main(String[] args) 
	{
		List<Conta> contas = new ArrayList<>();
		
		LocalDate doisMesesAtras = LocalDate.now().minusMonths(2);
		
		contas.add(new Conta("Geovan", new BigDecimal(99), doisMesesAtras));
		contas.add(new Conta("Patricia", new BigDecimal(501), doisMesesAtras));
		contas.add(new Conta("Erick", new BigDecimal(400), LocalDate.now()));
		contas.add(new Conta("Lula", new BigDecimal(400), doisMesesAtras));
		
		Filtro menorQueCem = new MenorQueCem();
		Filtro filtroMesCorrente = new AberturaNoMesCorrente(menorQueCem);
		Filtro maiorQueQuinhetos = new MaiorQueQuinhentos(filtroMesCorrente);
		
		List<Conta> filtra = maiorQueQuinhetos.filtra(contas);
		
		filtra
		.forEach(c -> System.out.println(c.getTitular()));
	}
}
