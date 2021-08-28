package br.com.carolina.tp3.model.service;

import br.com.carolina.tp3.model.domain.Solicitante;
import br.com.carolina.tp3.model.repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteService {
    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public List<Solicitante> obterLista() {
        return (List<Solicitante>) solicitanteRepository.findAll();
    }

    public void incluir(Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }

    public void excluir(Integer id) {
        solicitanteRepository.deleteById(id);
    }
}
