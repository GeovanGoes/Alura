package decorator.filtros;

import commons.Conta;
import commons.Filtro;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class MaiorQueQuinhentos extends Filtro{

	public MaiorQueQuinhentos(Filtro proximoFiltro) 
	{
		super(proximoFiltro);
	}
	
	public MaiorQueQuinhentos() {}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) 
	{
		List<Conta> collect = contas
		.stream()
		.filter(c -> c.getSaldo().compareTo(new BigDecimal(500)) == 1)
		.collect(Collectors.toList());
		
		collect.addAll(executaProximoFiltro(contas));
		
		return collect;
	}

}
