package leonardo.valter.credito.entity.repository.proposta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import leonardo.valter.credito.entity.Proposta;

@Repository
public class PropostaInterfaceImpl implements PropostaInterface {

	@PersistenceContext
    private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Proposta> consultarPropostasSemAvaliacao() throws NoResultException {
		try {    		
    		String sql = "select * from proposta where status is null";
    		Query query = entityManager.createNativeQuery(sql, Proposta.class);    		
			List<Proposta> propostas = (List<Proposta>) query.getResultList();

            return propostas;
			
		} catch (Exception e) {
			throw e;
		} finally {
			entityManager.close();
		} 
	}
}
