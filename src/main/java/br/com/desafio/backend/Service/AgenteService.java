package br.com.desafio.backend.Service;

import br.com.desafio.backend.Model.Agente;
import br.com.desafio.backend.Model.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AgenteService {
    private final AgenteRepository agenteRepository;

    @Autowired
    public AgenteService(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }

    @Transactional
    public void salvarAgente(Agente agente) {
        agenteRepository.save(agente);
    }

}