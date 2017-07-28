package commons;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro 
{
	private Filtro proximoFiltro;

	public Filtro(Filtro proximoFiltro) 
	{
		this.proximoFiltro = proximoFiltro;
		
	}
	
	public Filtro() {}
	
	public abstract List<Conta> filtra (List<Conta> contas);
	
	public List<Conta> executaProximoFiltro(List<Conta> contas)
	{
		if (proximoFiltro != null)
		{
			return proximoFiltro.filtra(contas);
		}
		return new ArrayList<Conta>();
	}
}
