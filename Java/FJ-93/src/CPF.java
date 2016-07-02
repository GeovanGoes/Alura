
public class CPF implements Documento{
	private final String valor;

	public CPF(String cpf) {;
		this.valor = cpf;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof CPF)){
			return false;
		}
		CPF param = (CPF)obj;
		return this.valor.equals(param.toString());
	}

	@Override
	public boolean ehValido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getValor() {
		// TODO Auto-generated method stub
		return null;
	}
}
