package br.com.carolina.at.model.repository;

import br.com.carolina.at.model.domain.Livro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer> {
    @Query("from Livro l where l.usuario.id = :userId order by l.titulo")
    List<Livro> obterLista(Integer userId);
}
