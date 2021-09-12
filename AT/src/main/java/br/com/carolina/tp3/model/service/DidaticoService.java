package br.com.carolina.tp3.model.service;

import br.com.carolina.tp3.model.domain.Didatico;
import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.repository.DidaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DidaticoService {
    @Autowired
    private DidaticoRepository didaticoRepository;

    public List<Didatico> obterLista(Usuario usuario){
        return didaticoRepository.obterLista(usuario.getId());
    }
    public List<Didatico> obterLista(){
        return (List<Didatico>) didaticoRepository.findAll();
    }

    public void incluir(Didatico didatico) {
        didaticoRepository.save(didatico);
    }

    public void excluir(Integer id) {
        didaticoRepository.deleteById(id);
    }

    public Didatico obterPorId(Integer id) {
        return didaticoRepository.findById(id).orElse(null);
    }
}
