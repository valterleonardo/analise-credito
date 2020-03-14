package leonardo.valter.credito.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import leonardo.valter.credito.dto.PropostaDTO;

@FeignClient(url = "${analise-credito-core.url}", name = "analise-credito-core-api")
public interface AnaliseCreditoCore {

	@PostMapping("/analisar")
	@Transactional(value = TxType.REQUIRES_NEW)
	PropostaDTO avaliarCredito(PropostaDTO proposta);
}