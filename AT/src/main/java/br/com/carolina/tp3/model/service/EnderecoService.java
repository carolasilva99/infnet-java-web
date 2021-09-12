package br.com.carolina.tp3.model.service;

import br.com.carolina.tp3.clients.IEnderecoClient;
import br.com.carolina.tp3.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}