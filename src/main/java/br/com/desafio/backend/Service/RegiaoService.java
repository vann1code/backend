package br.com.desafio.backend.Service;

import br.com.desafio.backend.Model.Regiao;
import br.com.desafio.backend.Model.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegiaoService {

    private final RegiaoRepository regiaoRepository;

    @Autowired
    public RegiaoService(RegiaoRepository regiaoRepository) {
        this.regiaoRepository = regiaoRepository;
    }

    public Regiao salvarRegiao(Regiao regiao) {
        return regiaoRepository.save(regiao);
    }

//    public Double somarGeracaoPorRegiao(String sigla) {
//        return regiaoRepository.somarGeracaoPorRegiao(sigla);
//    }

}