package br.com.desafio.backend.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {
//    @Query("SELECT SUM(r.geracao.valor) FROM Regiao r WHERE r.sigla = :sigla")
//    Double somarGeracaoPorRegiao(String sigla);
}