package br.com.carolina.at.model.repository;

import br.com.carolina.at.model.domain.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
    @Query("from Reserva r where r.usuario.id = :userId order by r.id")
    List<Reserva> obterLista(Integer userId);
}
