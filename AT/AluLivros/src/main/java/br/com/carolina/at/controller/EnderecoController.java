package br.com.carolina.at.controller;

import br.com.carolina.at.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;

	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep) {
		
		model.addAttribute("meuEndereco", enderecoService.obterCep(cep));
		
		return "usuario/cadastro";
	}
}
