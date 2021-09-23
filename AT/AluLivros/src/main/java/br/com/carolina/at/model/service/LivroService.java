package br.com.carolina.at.model.service;

import br.com.carolina.at.model.domain.Livro;
import br.com.carolina.at.model.domain.Usuario;
import br.com.carolina.at.model.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> obterLista(Usuario usuario){
        return (List<Livro>) livroRepository.obterLista(usuario.getId());
    }
    public List<Livro> obterLista(){
        return (List<Livro>) livroRepository.findAll();
    }

    public void excluir(Integer id) {
        livroRepository.deleteById(id);
    }

    public Livro obterPorId(Integer id) {
        return livroRepository.findById(id).orElse(null);
    }
}
