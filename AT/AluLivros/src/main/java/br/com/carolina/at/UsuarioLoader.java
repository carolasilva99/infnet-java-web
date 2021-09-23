package br.com.carolina.at;

import br.com.carolina.at.model.Endereco;
import br.com.carolina.at.model.domain.Usuario;
import br.com.carolina.at.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("bairro admin");
		endereco.setCep("12345678");
		endereco.setComplemento("complemento admin");
		endereco.setLocalidade("localidade admin");
		endereco.setLogradouro("logradouro admin");
		endereco.setUf("RJ");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Carolina A R Silva");
		usuario.setEmail("carolina.rsilva@al.infnet.edu.br");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
	}
}
