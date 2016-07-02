import java.text.NumberFormat;
import java.util.Locale;


/**
 * @author geovan
 * classe que reúne métodos que podem ser reaproveitados em diversas partes do código
 * */
public class ProgramUtils {
	
	private static Locale defaultLocale = new Locale("pt","BR");
	
	/**
	 * Instância do NumberFormat para o Locale pt-BR
	 * */
	private static NumberFormat formatador = NumberFormat.getCurrencyInstance(defaultLocale);
	
	
	/**
	 * Método usado para setar um novo locale
	 * */
	public static void configureUtilsLocale(Locale locale){
		defaultLocale = locale;
		formatador = NumberFormat.getCurrencyInstance(defaultLocale);
	}
	
	/**
	 * Método responsável por formatar um valor monetário para Real
	 * */
	public static String formatValueToReal(Object value){
		return formatador.format(value);
	}
	
	
}
