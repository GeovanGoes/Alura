package flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		NotasMusicais notasmu = new NotasMusicais();
		
		List<Nota> notas = Arrays.asList(
				notasmu.pega("do"), 
				notasmu.pega("re"), 
				notasmu.pega("mi"), 
				notasmu.pega("fa"), 
				notasmu.pega("fa"),
				notasmu.pega("fa"));
		
		new Piano().toca(notas);
	}
}
