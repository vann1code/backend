package br.com.desafio.backend.BFF;

import br.com.desafio.backend.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.util.List;

@RestController
@CrossOrigin("*")

public class WebController {

    @Autowired
    private ProcessamentoServico processamentoServico;

    @PostMapping("/upload")
    public ResponseEntity<ApiResponse> uploadFiles(@RequestParam("file") MultipartFile file) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file.getInputStream());

            //Extraindo Código do Agente (XML)
            List<String> codigos = ExtrairCodigos.extrairCodigos(document);
            System.out.println("Agentes recebidos - Códigos: " + codigos);

            ApiResponse response = new ApiResponse("Arquivo Enviado com sucesso");

            System.out.println(response.getMessage());

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ApiResponse errorResponse = new ApiResponse("Erro durante o processamento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

}