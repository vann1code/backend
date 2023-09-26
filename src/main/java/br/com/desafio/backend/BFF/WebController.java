package br.com.desafio.backend.BFF;

import br.com.desafio.backend.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")

public class WebController {

    @PostMapping("/upload")
    public ResponseEntity<ApiResponse> uploadFiles(@RequestParam("file") MultipartFile file) throws ParserConfigurationException, IOException, SAXException {

        Agentes agentes = new ManipularXml().convertXmlToObject(file);

        if(agentes != null){
           for(Agente agente : agentes.getAgente()){
               for(Regiao regiao : agente.getRegiao()){
                   List<Double> precoMedio = regiao.getPrecoMedio();
                   for(int i = 0; i < precoMedio.size(); i ++)
                       precoMedio.set(i, 0.0);
               }
           }
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file.getInputStream());

        // Extraindo Data do agente (XML)
        List<String> dates = ExtrairDatas.extrairDatas(document);

        //Extraindo Código do Agente (XML)
        List<String> codigos = ExtrairCodigos.extrairCodigos(document);
        System.out.println("Agentes recebidos - Códigos: " + codigos);

        ApiResponse response = new ApiResponse("Arquivo Enviado com sucesso");

        System.out.println(response.getMessage());

        return ResponseEntity.ok(response);

    }

}