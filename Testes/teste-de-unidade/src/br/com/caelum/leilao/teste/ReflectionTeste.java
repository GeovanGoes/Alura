package br.com.caelum.leilao.teste;

import java.lang.reflect.Field;

import br.com.caelum.leilao.dominio.Lance;

public class ReflectionTeste {
	public static void main(String[] args) {
		Class<Lance> classe = Lance.class;
		System.out.println("Starting the execution...");
		for(Field atributo : classe.getFields()){
			System.out.println("ooo");
			System.out.println(atributo.getName());
		}
		System.out.println("Finalizing the execution");
		
	}
}
