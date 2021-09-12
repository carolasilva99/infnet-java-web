package br.com.carolina.tp3;

import br.com.carolina.tp3.model.domain.Usuario;
import br.com.carolina.tp3.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("Carolina Alves da Rocha Silva");
        usuario.setEmail("carolasilva99@gmail.com");
        usuario.setSenha("12345");
        usuario.setAdmin(true);

        usuarioService.incluir(usuario);

        System.out.println("Inclusão realizada!");
    }
}