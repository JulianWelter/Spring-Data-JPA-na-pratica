package br.com.desafio.dio.repositories;

import br.com.desafio.dio.models.Equipamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRepository extends CrudRepository<Equipamento, Long> {
}
