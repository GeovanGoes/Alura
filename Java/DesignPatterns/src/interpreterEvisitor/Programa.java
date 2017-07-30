package interpreterEvisitor;

import java.util.Arrays;

public class Programa 
{
	
	
	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(Arrays.asList(new Soma(Arrays.asList(new Numero(4), new Numero(5))), new Numero(5)));
		System.out.println(esquerda.avalia());
		Expressao direita = new Soma(Arrays.asList(new Numero(2), new Numero(10)));
		System.out.println(direita.avalia());
		Expressao soma = new Soma (Arrays.asList(direita, esquerda));
		
		System.out.println(soma.avalia());		
		
		Expressao multiplicacao = new Multiplicacao(Arrays.asList(soma,new Numero(3)));
		System.out.println(multiplicacao.avalia());
		
		Expressao divisao = new Divisao(Arrays.asList(multiplicacao, new Numero(3)));
		System.out.println(divisao.avalia());
		
		Expressao raiz = new RaizQuadrada(divisao);
		System.out.println(raiz.avalia());
		
		raiz.aceita(new ImpressoraVisitor());
	}
	
/*	
	*/
}