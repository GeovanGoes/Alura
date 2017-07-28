package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String obs;
	private Calendar data;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj)
	{
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item)
	{
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacvoes(String obs)
	{
		this.obs = obs;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual ()
	{
		data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() 
	{
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, obs);
	}
}
