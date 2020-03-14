package leonardo.valter.credito.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import leonardo.valter.credito.dto.PropostaDTO;
import leonardo.valter.credito.entity.Proposta;
import leonardo.valter.credito.entity.repository.proposta.PropostaRepository;

@Component
public class PropostaService {
	
	@Autowired private AnaliseCreditoCore analiseCreditoCore;
	@Autowired private PropostaRepository propostaRepository;

	public void avaliarCredito(PropostaDTO proposta) {
		PropostaDTO propostaProcessada = analiseCreditoCore.avaliarCredito(proposta);
		salvarResultado(propostaProcessada);		
	}
	
	public void avaliarCredito(List<PropostaDTO> proposta) {
		for (PropostaDTO propostaDTO : proposta) {
			PropostaDTO propostaProcessada = analiseCreditoCore.avaliarCredito(propostaDTO);
			salvarResultado(propostaProcessada);
		}
	}

	private void salvarResultado(PropostaDTO propostaProcessada) {
		Optional<Proposta> optionalProposta = propostaRepository.findById(propostaProcessada.getId());
		if(optionalProposta.isPresent()) {
			Proposta proposta = optionalProposta.get();
			proposta.setLimite(propostaProcessada.getLimite());
			proposta.setStatus(propostaProcessada.getStatus());
			propostaRepository.save(proposta);
		}
	}
}
