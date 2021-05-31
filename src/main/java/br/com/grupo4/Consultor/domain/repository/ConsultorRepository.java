package br.com.grupo4.Consultor.domain.repository;

import br.com.grupo4.Consultor.domain.model.Consultor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultorRepository extends JpaRepository<Consultor, Long> {

    List<Consultor> findByNome(String nome);

    List<Consultor> findByNomeContaining(String nome);
}
