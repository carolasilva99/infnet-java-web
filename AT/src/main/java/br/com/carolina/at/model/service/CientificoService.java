package br.com.carolina.at.model.service;

import br.com.carolina.at.model.domain.Cientifico;
import br.com.carolina.at.model.domain.Usuario;
import br.com.carolina.at.model.repository.CientificoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CientificoService {
    @Autowired
    private CientificoRepository cientificoRepository;

    public List<Cientifico> obterLista(Usuario usuario){
        return cientificoRepository.obterLista(usuario.getId());
    }
    public List<Cientifico> obterLista(){
        return (List<Cientifico>) cientificoRepository.findAll();
    }

    public void incluir(Cientifico cientifico) {
        cientificoRepository.save(cientifico);
    }

    public void excluir(Integer id) {
        cientificoRepository.deleteById(id);
    }

    public Cientifico obterPorId(Integer id) {
        return cientificoRepository.findById(id).orElse(null);
    }
}
