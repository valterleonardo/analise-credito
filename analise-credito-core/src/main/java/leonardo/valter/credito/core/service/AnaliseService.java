package leonardo.valter.credito.core.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import leonardo.valter.credito.core.dto.PropostaDTO;
import leonardo.valter.credito.core.dto.dict.LimiteEnum;
import leonardo.valter.credito.core.dto.dict.StatusPropostaEnum;
import leonardo.valter.credito.core.exceptions.PoliticaCreditoException;
import leonardo.valter.credito.core.exceptions.SalarioException;
import leonardo.valter.credito.core.service.dependente.Dependente;
import leonardo.valter.credito.core.service.dependente.DependentesService;
import leonardo.valter.credito.core.service.estadocivil.EstadoCivil;
import leonardo.valter.credito.core.service.estadocivil.EstadoCivilService;
import leonardo.valter.credito.core.service.idade.Idade;
import leonardo.valter.credito.core.service.idade.IdadeService;
import leonardo.valter.credito.core.service.limite.Limite;
import leonardo.valter.credito.core.service.limite.LimiteService;
import leonardo.valter.credito.core.service.salario.Salario;
import leonardo.valter.credito.core.service.salario.SalarioService;
import leonardo.valter.credito.core.service.sexo.Sexo;
import leonardo.valter.credito.core.service.sexo.SexoService;

@Service
public class AnaliseService {

	private static final BigDecimal RENDA_MINIMA = new BigDecimal(500);
	private static Salario salarioProcessador 	= SalarioService.iniciarRegraSalario();
	private static Idade idadeProcessador = IdadeService.iniciarRegraIdade();
	private static EstadoCivil estadoCivilProcessador = EstadoCivilService.iniciarRegraEstadoCivil();
	private static Dependente dependentesProcessador = DependentesService.iniciarRegraDependente();
	private static Sexo sexoProcessador = SexoService.iniciarRegraSexo();
	private static Limite limiteProcessador = LimiteService.iniciarRegraLimite();
	
	public PropostaDTO processarProposta(PropostaDTO proposta) {
		
		try {
			int pontuacao = pontuarProposta(proposta);
			proposta.setLimite(escolherLimite(proposta, pontuacao));
			proposta.setStatus(StatusPropostaEnum.APROVADO);
		} catch (SalarioException e) {
			return retornaNegadoRendaBaixa(proposta);
		} catch (PoliticaCreditoException e) {
            return retornaNegadoReprovado(proposta);
        }
		
		return proposta;
	}

	private LimiteEnum escolherLimite(PropostaDTO proposta, int pontuacao) {
		BigDecimal fatorCalculado = RENDA_MINIMA.multiply(BigDecimal.valueOf(pontuacao));
        BigDecimal limiteFinal = proposta.getRenda().subtract(fatorCalculado);
        
		return limiteProcessador.processar(limiteFinal);
	}

	private int pontuarProposta(PropostaDTO proposta) {
		int pontuacao = 0;
		pontuacao += salarioProcessador.processar(proposta.getRenda());
		pontuacao += idadeProcessador.processar(proposta.getIdade());
		pontuacao += estadoCivilProcessador.processar(proposta.getEstadoCivil());
		pontuacao += dependentesProcessador.processar(proposta.getDependentes());
		pontuacao += sexoProcessador.processar(proposta.getSexo(), proposta.getEstadoCivil(), 0);
		
		return pontuacao;
	}
	
	private PropostaDTO retornaNegadoReprovado(PropostaDTO proposta) {
		negarStatus(proposta);
		proposta.setLimite(LimiteEnum.REPROVADO);
		return proposta;
	}

	private PropostaDTO retornaNegadoRendaBaixa(PropostaDTO proposta) {
		negarStatus(proposta);
		proposta.setLimite(LimiteEnum.RENDA_BAIXA);
		return proposta;
	}

	private void negarStatus(PropostaDTO proposta) {
		proposta.setStatus(StatusPropostaEnum.NEGADO);
	}
}