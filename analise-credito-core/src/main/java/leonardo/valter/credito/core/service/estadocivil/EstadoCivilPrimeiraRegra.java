package leonardo.valter.credito.core.service.estadocivil;

import leonardo.valter.credito.core.dto.dict.EstadoCivilEnum;

public class EstadoCivilPrimeiraRegra implements EstadoCivil {

private EstadoCivil proximaRegraEstadoCivil;
	
	public void proximo(EstadoCivil regra) {
    	proximaRegraEstadoCivil = regra; 
    } 

	public int processar(EstadoCivilEnum estadoCivil) {
    	if (EstadoCivilEnum.CASADO.equals(estadoCivil) || EstadoCivilEnum.DIVORCIADO.equals(estadoCivil))
    		return 1;
    	else 
    		return 0;
    } 
}