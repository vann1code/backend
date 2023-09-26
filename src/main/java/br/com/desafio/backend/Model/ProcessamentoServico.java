package br.com.desafio.backend.Model;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
@Service
public class ProcessamentoServico {

    @Async
    public void processFile(MultipartFile file) {
        try {

            Agentes agentes = new ManipularXml().convertXmlToObject(file);

            if (agentes != null) {
                for (Agente agente : agentes.getAgente()) {
                    for (Regiao regiao : agente.getRegiao()) {
                        List<Double> precoMedio = regiao.getPrecoMedio();
                        for (int i = 0; i < precoMedio.size(); i++)
                            precoMedio.set(i, 0.0);
                    }
                }
            }

        } catch (Exception ignored) {
        }
    }
}