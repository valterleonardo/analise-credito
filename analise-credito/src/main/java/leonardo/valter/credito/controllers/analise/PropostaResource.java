package leonardo.valter.credito.controllers.analise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import leonardo.valter.credito.entity.Proposta;
import leonardo.valter.credito.entity.repository.proposta.PropostaRepository;

@RestController
@RequestMapping(value="/api/proposta")
@CrossOrigin
public class PropostaResource {
	
	@Autowired private PropostaRepository propostaRepository;
	
	@GetMapping
	public ResponseEntity<List<Proposta>> consultarPropostas() {
		List<Proposta> propostas = propostaRepository.findAll();
		if(propostas.size()==0) {
			return new ResponseEntity<List<Proposta>>(HttpStatus.NO_CONTENT);
		}
	    return new ResponseEntity<List<Proposta>>(propostas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Proposta> consultarProposta(@PathVariable Integer id) {
		Optional<Proposta> proposta = propostaRepository.findById(id);
		if(proposta.isPresent()) {
			return new ResponseEntity<Proposta>(proposta.get(), HttpStatus.OK);
		}		
		return new ResponseEntity<Proposta>(HttpStatus.NO_CONTENT);	    
	}
	
	@PostMapping
	public ResponseEntity<Proposta> salvarProposta(@RequestBody Proposta proposta) {
		Proposta propostaNova = propostaRepository.save(proposta);
	    return new ResponseEntity<Proposta>(propostaNova, HttpStatus.OK);
	}
	
}
