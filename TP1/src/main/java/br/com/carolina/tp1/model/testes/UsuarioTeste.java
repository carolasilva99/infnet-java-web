package br.com.carolina.tp1.model.testes;

import br.com.carolina.tp1.model.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTeste {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario("carol", "carol@carol.com", "senha123");
        Usuario usuario2 = new Usuario("joão", "joaozinho@jo.com", "pa$$word");
        Usuario usuario3 = new Usuario("marcos", "relampago_marquinhos@gmail.com", "minhasenha123");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        System.out.println("Usuário: " + usuarios.get(0).getEmail());

        System.out.println("Quantidade: " + usuarios.size());
        for (Usuario usuario : usuarios) {
            System.out.println("Usuário: " + usuario.getNome());
        }
    }
}
