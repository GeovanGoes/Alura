package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {
	
	@RequestMapping(value="olaMundoSpring")
	public String testMessage(){
		return "ola";
	}

}
