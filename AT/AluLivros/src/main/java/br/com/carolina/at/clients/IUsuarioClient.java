package br.com.carolina.at.clients;

import br.com.carolina.at.model.domain.Login;
import br.com.carolina.at.model.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8081", name = "usuarioClient")
public interface IUsuarioClient {

	@GetMapping(value = "/usuarios")
	List<Usuario> obterLista();

	@PostMapping(value = "/usuarios")
	void incluir(Usuario usuario);

	@DeleteMapping(value = "/usuarios/{id}")
	void excluir(@PathVariable Integer id);

	@PostMapping(value = "/usuarios/autenticar")
	Usuario validar(@RequestBody Login login);
}