package br.com.carolina.tp3.model.service;

import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(String email, String senha) {

        return usuarioRepository.autenticacao(email, senha);
    }

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> obterLista(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
