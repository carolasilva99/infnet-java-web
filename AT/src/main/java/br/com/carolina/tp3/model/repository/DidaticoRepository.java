package br.com.carolina.tp3.model.repository;

import br.com.carolina.tp3.model.domain.Didatico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DidaticoRepository extends CrudRepository<Didatico, Integer> {
    @Query("from Didatico d where d.usuario.id = :userId")
    List<Didatico> obterLista(Integer userId);
}
