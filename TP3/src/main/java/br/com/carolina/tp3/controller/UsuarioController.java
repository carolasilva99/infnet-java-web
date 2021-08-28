package br.com.carolina.tp3.controller;

import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "cadastro";
    }

    @PostMapping(value = "/usuario")
    public String incluir(Usuario usuario) {

        usuarioService.incluir(usuario);

        return "redirect:/";
    }
}
