package leonardo.valter.credito.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import leonardo.valter.credito.dto.PropostaDTO;
import leonardo.valter.credito.entity.Proposta;

@Component
public class PropostaToDTO {
	
	@Autowired private PropostaToDTO propostaDto;

	public PropostaDTO toDto(Proposta proposta) {
		
		PropostaDTO propostaDTO = new PropostaDTO();
		propostaDTO.setDependentes(proposta.getDependentes());
		propostaDTO.setEstadoCivil(proposta.getEstadoCivil());
		propostaDTO.setId(proposta.getId());
		propostaDTO.setIdade(proposta.getIdade());
		propostaDTO.setSexo(proposta.getSexo());
		propostaDTO.setRenda(proposta.getRenda());
		
		return propostaDTO;
	}

	public List<PropostaDTO> toDto(List<Proposta> propostas) {
		List<PropostaDTO> propostaDTO = new ArrayList<PropostaDTO>();
		for (Proposta proposta : propostas) {
			propostaDTO.add(propostaDto.toDto(proposta));
		}
		return propostaDTO;
	}
}
