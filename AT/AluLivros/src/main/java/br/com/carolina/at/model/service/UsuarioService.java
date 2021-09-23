package br.com.carolina.at.model.service;

import br.com.carolina.at.clients.IUsuarioClient;
import br.com.carolina.at.model.domain.Login;
import br.com.carolina.at.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioClient usuarioClient;

    public Usuario validar(String email, String senha) {

        return usuarioClient.validar(new Login(email, senha));
    }

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);
    }

    public List<Usuario> obterLista(){
        return usuarioClient.obterLista();
    }
}
