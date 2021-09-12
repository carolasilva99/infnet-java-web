package br.com.carolina.tp3.controller;

import br.com.carolina.tp3.model.domain.Didatico;
import br.com.carolina.tp3.model.domain.Literatura;
import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.service.LiteraturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class LiteraturaController {
    @Autowired
    private LiteraturaService literaturaService;

    @GetMapping(value = "/literatura/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("literaturas", literaturaService.obterLista(usuario));

        return "literatura/lista";
    }

    @GetMapping(value = "/literatura")
    public String telaCadastro() {
        return "literatura/cadastro";
    }

    @PostMapping(value = "/literatura/incluir")
    public String incluir(Model model, Literatura literatura, @SessionAttribute("user") Usuario usuario) {

        literatura.setUsuario(usuario);

        literaturaService.incluir(literatura);

        model.addAttribute("msg", "Livro de literatura " + literatura.getTitulo() + " cadastrado com sucesso!!!");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/literatura/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Literatura literatura = literaturaService.obterPorId(id);

        literaturaService.excluir(id);

        model.addAttribute("msg", "Livro de literatura " + literatura.getTitulo() + " removido com sucesso!!!");

        return telaLista(model, usuario);
    }
}
