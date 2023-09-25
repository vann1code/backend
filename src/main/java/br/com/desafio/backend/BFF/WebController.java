package br.com.desafio.backend.BFF;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import br.com.desafio.backend.Model.ApiResponse;

@RestController
@CrossOrigin("*")

public class WebController {
	@PostMapping("/upload")
	public ResponseEntity<ApiResponse> uploadFiles(@RequestParam("file") MultipartFile file) {
		
		ApiResponse response = new ApiResponse("Arquivo Enviado com sucesso");
		
		System.out.println(response.getMessage());
		
		return ResponseEntity.ok(response);
		
	}

}