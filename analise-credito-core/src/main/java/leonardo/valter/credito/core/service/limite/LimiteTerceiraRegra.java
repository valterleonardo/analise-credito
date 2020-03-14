package leonardo.valter.credito.core.service.limite;

import java.math.BigDecimal;

import leonardo.valter.credito.core.dto.dict.LimiteEnum;

public class LimiteTerceiraRegra implements Limite {

	private Limite proximaRegraLimite;
	
	public void proximo(Limite regra) {
    	proximaRegraLimite = regra; 
    } 

	public LimiteEnum processar(BigDecimal limite) {
		if(limite.compareTo(new BigDecimal(1000)) > 0) 
			return LimiteEnum.ENTRE_1000_1500;
		
    	return proximaRegraLimite.processar(limite);
    } 
}