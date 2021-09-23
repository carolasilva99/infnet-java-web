package br.com.carolina.at.model.service;

import br.com.carolina.at.clients.IEnderecoClient;
import br.com.carolina.at.model.Endereco;
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