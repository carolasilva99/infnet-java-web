package br.com.carolina.tp3.model.repository;

import br.com.carolina.tp3.model.domain.Cientifico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CientificoRepository extends CrudRepository<Cientifico, Integer> {
    @Query("from Cientifico c where c.usuario.id = :userId")
    List<Cientifico> obterLista(Integer userId);
}
