package leonardo.valter.credito.core.controllers.analise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import leonardo.valter.credito.core.dto.PropostaDTO;
import leonardo.valter.credito.core.service.AnaliseService;

@RestController
@RequestMapping(value="/api/proposta")
@CrossOrigin
public class AnaliseResource {
	
	@Autowired AnaliseService analiseService;
	
	@PostMapping(value = "/analisar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PropostaDTO> processarProposta(@RequestBody PropostaDTO proposta){		
		return ResponseEntity.ok(analiseService.processarProposta(proposta));
	}
}
