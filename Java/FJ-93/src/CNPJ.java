
public class CNPJ implements Documento{
	private String valor;

	public CNPJ(String valor) {
		this.valor = valor;
	}
	
	public CNPJ() {
	}

	public void setValor(String cnpjCredor) {
		this.valor = cnpjCredor;
	}
	
	public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    private int primeiroDigitoVerificador() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo valor
    	return 0;
    }
    private int primeiroDigitoCorreto() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo valor
    	return 0;
    }
    private int segundoDigitoVerificador() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo valor
    	return 0;
    }
    private int segundoDigitoCorreto() {
        // Calcula o segundo dígito verificador correto para
        // o CNPJ armazenado no atributo valor
    	return 0;
    }
    
    @Override
	public String toString() {
		return valor;
	}

	@Override
	public String getValor() {
		// TODO Auto-generated method stub
		return null;
	}
}
