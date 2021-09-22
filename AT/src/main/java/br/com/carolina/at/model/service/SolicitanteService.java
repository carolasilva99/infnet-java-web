package br.com.carolina.at.model.service;

import br.com.carolina.at.model.domain.Solicitante;
import br.com.carolina.at.model.domain.Usuario;
import br.com.carolina.at.model.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteService {
    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public List<Solicitante> obterLista(Usuario usuario){
        return solicitanteRepository.obterLista(usuario.getId());
    }

    public List<Solicitante> obterLista(){

        return (List<Solicitante>) solicitanteRepository.findAll();
    }

    public void incluir(Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }

    public void excluir(Integer id) {
        solicitanteRepository.deleteById(id);
    }

    public Solicitante obterPorId(Integer id) {
        return solicitanteRepository.findById(id).orElse(null);
    }
}
