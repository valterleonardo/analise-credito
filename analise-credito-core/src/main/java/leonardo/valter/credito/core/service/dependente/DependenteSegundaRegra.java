package leonardo.valter.credito.core.service.dependente;

public class DependenteSegundaRegra implements Dependente {

	private Dependente proximaRegraDependente;
	
	public void proximo(Dependente regra) {
    	proximaRegraDependente = regra; 
    } 

	public int processar(Integer dependente) {
    	if (dependente > 0 && dependente < 3)
    		return dependente + 2;
    	else 
    		return dependente + 3;
    } 

}
