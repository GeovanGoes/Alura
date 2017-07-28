package decorator.filtros;

import commons.Conta;
import commons.Filtro;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class AberturaNoMesCorrente extends Filtro{
	
	public AberturaNoMesCorrente(Filtro proximoFiltro)
	{
		super(proximoFiltro);
	}
	
	public AberturaNoMesCorrente() {}

	@Override
	public List<Conta> filtra(List<Conta> contas) 
	{
		Month mesAtual = LocalDate.now().getMonth();

		List<Conta> collect = contas
		.stream()
		.filter(c -> c.getAberturaConta().getMonth().equals(mesAtual))
		.collect(Collectors.toList());
		
		collect.addAll(executaProximoFiltro(contas));
		
		return collect;
	}
	
	

}
