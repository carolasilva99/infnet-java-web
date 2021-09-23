package br.com.carolina.at.model.repository;

import br.com.carolina.at.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {
    @Query("from Solicitante s where s.usuario.id = :userId order by s.nome")
    List<Solicitante> obterLista(Integer userId);
}
