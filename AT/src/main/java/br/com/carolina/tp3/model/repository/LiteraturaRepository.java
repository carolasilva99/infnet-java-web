package br.com.carolina.tp3.model.repository;

import br.com.carolina.tp3.model.domain.Didatico;
import br.com.carolina.tp3.model.domain.Literatura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiteraturaRepository extends CrudRepository<Literatura, Integer> {
    @Query("from Literatura l where l.usuario.id = :userId")
    List<Literatura> obterLista(Integer userId);
}
