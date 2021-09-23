package br.com.carolina.at.model.repository;

import br.com.carolina.at.model.domain.Didatico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DidaticoRepository extends CrudRepository<Didatico, Integer> {
    @Query("from Didatico d where d.usuario.id = :userId order by d.titulo")
    List<Didatico> obterLista(Integer userId);
}
