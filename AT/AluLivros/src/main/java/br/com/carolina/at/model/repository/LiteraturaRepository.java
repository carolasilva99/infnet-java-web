package br.com.carolina.at.model.repository;

import br.com.carolina.at.model.domain.Literatura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiteraturaRepository extends CrudRepository<Literatura, Integer> {
    @Query("from Literatura l where l.usuario.id = :userId order by l.titulo")
    List<Literatura> obterLista(Integer userId);
}
