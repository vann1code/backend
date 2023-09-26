//package br.com.desafio.backend.BFF;
//
//import br.com.desafio.backend.Model.Agente;
//import br.com.desafio.backend.Service.AgenteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/agentes")
//public class AgenteController {
//    private final AgenteService agenteService;
//
//    @Autowired
//    public AgenteController(AgenteService agenteService) {
//        this.agenteService = agenteService;
//    }
//
//    @PostMapping("/salvar")
//    public ResponseEntity<String> salvarNovoAgente(@RequestBody Agente agente) {
//        try {
//            agenteService.salvarAgente(agente);
//            return ResponseEntity.ok("Agente salvo com sucesso.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("Erro ao salvar o agente: " + e.getMessage());
//        }
//    }
//}