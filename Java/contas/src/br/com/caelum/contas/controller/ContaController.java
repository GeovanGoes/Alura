package br.com.caelum.contas.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {
	
	
	private ContaDAO contaDAO;
	@Autowired
	public ContaController(ContaDAO dao){
		this.contaDAO = dao;
	}
	
	@RequestMapping(value="formulario")
	public String formulario(){
		return "formulario";
	}
	
	@RequestMapping(value="adicionarConta")
	public String adiciona(@Valid Conta conta, BindingResult result){
		if (result.hasErrors()){
			return "formulario";
		}
		ContaDAO contaDAO = new ContaDAO();
		contaDAO.adiciona(conta);
		return "contaAdicionada";
	}
	
	@RequestMapping(value="/listaContas")
	public String lista(Model mv){
		List<Conta> contas = contaDAO.lista();
		
		mv.addAttribute("contas",contas);
		return "conta/lista";
	}
	
	@RequestMapping(value="removeConta")
	public String remove (Conta conta){
		contaDAO.remove(conta);
		
		return "redirect:listaContas";
	}
	
	@RequestMapping(value="pagaConta")
	public void paga (Conta conta, HttpServletResponse response){
		contaDAO.paga(conta.getId());
		 response.setStatus(200);
		 //return "redirect:listaContas";
	}
}
