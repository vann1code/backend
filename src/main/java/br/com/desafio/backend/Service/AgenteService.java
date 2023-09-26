package br.com.desafio.backend.Service;

import br.com.desafio.backend.Model.Agente;
import br.com.desafio.backend.Model.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenteService {

    private final AgenteRepository agenteRepository;

    @Autowired
    public AgenteService(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }

    public Agente salvarAgente(Agente agente) {
        return agenteRepository.save(agente);
    }

}