package leonardo.valter.credito.controllers.web;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import feign.RetryableException;
import leonardo.valter.credito.entity.Proposta;
import leonardo.valter.credito.entity.repository.proposta.PropostaRepository;
import leonardo.valter.credito.service.PropostaService;
import leonardo.valter.credito.service.PropostaToDTO;

@Controller
public class PropostaResourceWeb {
	
	@Autowired private PropostaRepository propostaRepository;
	@Autowired private PropostaToDTO propostaDto;
	@Autowired private PropostaService propostaService;

	@GetMapping(value = "/cadastrarProposta")
	public ModelAndView form(){
		ModelAndView mv = new ModelAndView("proposta/formProposta");
		
		return mv;
	}
	
	@PostMapping(value = "/cadastrarProposta")
	public ModelAndView form(Proposta proposta) {
		
		propostaRepository.save(proposta);
		propostaService.avaliarCredito(propostaDto.toDto(proposta));
		
		ModelAndView mv = new ModelAndView("proposta/formProposta");
		mv.addObject("mensagem", "Proposta cadastrada com sucesso!");
		
		return mv;
	}
	
	@GetMapping(value = "/propostas")
	public ModelAndView listarPropostas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Proposta> propostas = propostaRepository.findAll();
		mv.addObject("propostas", propostas);
		
		return mv;
	}
	
	@GetMapping(value = "/processarPropostas")
	public ModelAndView processar() {
		try {
			List<Proposta> propostas = propostaRepository.consultarPropostasSemAvaliacao();
			propostaService.avaliarCredito(propostaDto.toDto(propostas));
			
		} catch (NoResultException e) {
			return listarPropostas();
		} catch (RetryableException e) {
			ModelAndView mv = listarPropostas();
			mv.addObject("mensagem", "Erro ao chamar a API de processamento de crédito, tente novamente mais tarde!");
			return mv;
		}
		return listarPropostas();
	}
}
