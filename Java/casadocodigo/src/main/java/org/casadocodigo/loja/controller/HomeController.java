package org.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String index(){
		System.out.println("Entrando na home da casa do código");
		return "home";
	}
}
