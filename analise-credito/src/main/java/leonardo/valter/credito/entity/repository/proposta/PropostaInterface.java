package leonardo.valter.credito.entity.repository.proposta;

import java.util.List;

import leonardo.valter.credito.entity.Proposta;

public interface PropostaInterface {

	List<Proposta> consultarPropostasSemAvaliacao();
}
