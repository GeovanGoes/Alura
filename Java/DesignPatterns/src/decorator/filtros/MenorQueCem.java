package decorator.filtros;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import commons.Conta;
import commons.Filtro;

public class MenorQueCem extends Filtro
{
	
	public MenorQueCem(Filtro proximoFiltro) 
	{
		super(proximoFiltro);
	}
	
	public MenorQueCem() {}

	@Override
	public List<Conta> filtra(List<Conta> contas) 
	{
		List<Conta> collect = contas
				.stream()
				.filter(c -> c.getSaldo().compareTo(new BigDecimal(100)) == -1)
				.collect(Collectors.toList());
		
		collect.addAll(executaProximoFiltro(contas));
		
		return collect;
	}

}
