package BridgeEAdapter;

import java.util.Calendar;

/**Bridge - Leva para um outro sistema*/
public class Programa {
	
	public static void main(String[] args) 
	{
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua da putaria");
		
		
		/**
		 * Adapter - adapta uma interface antiga para uma interface nova
		 * */
		Calendar hoje = new RelogioSistema().hoje();
		
	}
}
