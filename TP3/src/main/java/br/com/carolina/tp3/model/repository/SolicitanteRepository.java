package br.com.carolina.tp3.model.repository;

import br.com.carolina.tp3.model.domain.Solicitante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {
}
