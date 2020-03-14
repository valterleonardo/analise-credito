package leonardo.valter.credito.core.service.dependente;

public class DependentePrimeiraRegra implements Dependente {

	private Dependente proximaRegraDependente;
	
	public void proximo(Dependente regra) {
    	proximaRegraDependente = regra; 
    } 

	public int processar(Integer dependente) {
    	if (dependente == 0)
    		return 0;
    	else 
    		return proximaRegraDependente.processar(dependente);
    } 
}
