package br.com.desafio.backend.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {

}