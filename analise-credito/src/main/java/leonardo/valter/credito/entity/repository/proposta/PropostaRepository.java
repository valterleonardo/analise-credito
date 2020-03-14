package leonardo.valter.credito.entity.repository.proposta;

import org.springframework.data.jpa.repository.JpaRepository;

import leonardo.valter.credito.entity.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Integer>, PropostaInterface{

}
