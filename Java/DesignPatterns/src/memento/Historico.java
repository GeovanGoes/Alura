package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	private List<Estado> estadosSalvos;
	
	public Historico() 
	{
		this.estadosSalvos = new ArrayList<>();
	}
	
	public void adiciona (Estado estado) 
	{
		estadosSalvos.add(estado);
	}
	
	public Estado pega(int index)
	{
		return estadosSalvos.get(index);
	}
	
}
