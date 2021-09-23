package br.com.carolina.at.controller;

import br.com.carolina.at.model.Endereco;
import br.com.carolina.at.model.domain.Usuario;
import br.com.carolina.at.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("lista", usuarioService.obterLista());

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario")
    public String incluir(Usuario usuario, Endereco endereco) {

        usuario.setEndereco(endereco);

        usuarioService.incluir(usuario);

        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {

        usuarioService.excluir(id);

        return "redirect:/usuario/lista";
    }
}
