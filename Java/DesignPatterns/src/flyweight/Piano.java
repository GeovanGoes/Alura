package flyweight;

import java.util.List;

import org.jfugue.Player;

public class Piano {
	public void toca(List<Nota> notas)
	{
		Player player = new Player();
		
		StringBuilder musica = new StringBuilder();
		
		notas.forEach(n -> musica.append(n.simbolo() + " "));
		
		System.out.println(musica);
		
		player.play(musica.toString());
	}
}
