package br.com.carolina.tp3.model.service;

import br.com.carolina.tp3.model.domain.Literatura;
import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.repository.LiteraturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiteraturaService {
    @Autowired
    private LiteraturaRepository literaturaRepository;

    public List<Literatura> obterLista(Usuario usuario){
        return literaturaRepository.obterLista(usuario.getId());
    }
    public List<Literatura> obterLista(){
        return (List<Literatura>) literaturaRepository.findAll();
    }

    public void incluir(Literatura literatura) {
        literaturaRepository.save(literatura);
    }

    public void excluir(Integer id) {
        literaturaRepository.deleteById(id);
    }

    public Literatura obterPorId(Integer id) {
        return literaturaRepository.findById(id).orElse(null);
    }
}
