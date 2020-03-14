package leonardo.valter.credito.core.service.limite;

import java.math.BigDecimal;

import leonardo.valter.credito.core.dto.dict.LimiteEnum;
import leonardo.valter.credito.core.exceptions.PoliticaCreditoException;

public class LimiteQuintaRegra implements Limite {

	private Limite proximaRegraLimite;
	
	public void proximo(Limite regra) {
    	proximaRegraLimite = regra; 
    } 

	public LimiteEnum processar(BigDecimal limite) {
		if(limite.compareTo(new BigDecimal(100)) > 0) 
			return LimiteEnum.ENTRE_100_500;
		
    	throw new PoliticaCreditoException();
    } 
}