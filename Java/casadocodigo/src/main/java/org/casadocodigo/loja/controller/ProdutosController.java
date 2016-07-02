package org.casadocodigo.loja.controller;

import org.casadocodigo.loja.daos.ProdutoDAO;
import org.casadocodigo.loja.models.Produto;
import org.casadocodigo.loja.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="produtos")
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping(value="/form")
	public ModelAndView form(){
		ModelAndView mv = new ModelAndView("produtos/form");
		mv.addObject("tipos",TipoPreco.values());
		
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String gravar(Produto produto){
		if(produto.getTitulo()==null || produto.getTitulo().isEmpty()){
			
		}
		
		System.out.println(produto.toString());
		produtoDAO.gravar(produto);
		return "ok";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("produtos/lista");
		mv.addObject("produtos",produtoDAO.listar());
		return mv;
	}
}
