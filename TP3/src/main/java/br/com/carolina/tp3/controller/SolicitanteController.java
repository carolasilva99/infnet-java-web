package br.com.carolina.tp3.controller;

import br.com.carolina.tp3.model.domain.Solicitante;
import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping(value = "/solicitante")
    public String tela() {
        return "solicitante/cadastro";
    }

    @GetMapping(value = "/solicitante/lista")
    public String telaLista(Model model) {
        model.addAttribute("lista", solicitanteService.obterLista());

        return "solicitante/lista";
    }

    @PostMapping(value = "/solicitante/incluir")
    public String incluir(Model model, Solicitante solicitante, @SessionAttribute("user")Usuario usuario) {
        solicitante.setUsuario(usuario);

        solicitanteService.incluir(solicitante);

        String mensagem = "O solicitante " + solicitante.getNome() + "foi cadastrado com sucesso!";

        model.addAttribute("msg", mensagem);

        return telaLista(model);
    }

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {
        solicitanteService.excluir(id);

        return "redirect:/solicitante/lista";
    }
}
