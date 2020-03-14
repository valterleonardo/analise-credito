package leonardo.valter.credito.core.service.limite;

import java.math.BigDecimal;

import leonardo.valter.credito.core.dto.dict.LimiteEnum;

public class LimitePrimeiraRegra implements Limite {

	private Limite proximaRegraLimite;
	
	public void proximo(Limite regra) {
    	proximaRegraLimite = regra; 
    } 

	public LimiteEnum processar(BigDecimal limite) {
		if(limite.compareTo(new BigDecimal(2000)) > 0) 
			return LimiteEnum.SUPERIOR_2000;
		
    	return proximaRegraLimite.processar(limite);
    } 
}