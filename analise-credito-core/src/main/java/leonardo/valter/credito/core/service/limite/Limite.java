package leonardo.valter.credito.core.service.limite;

import java.math.BigDecimal;

import leonardo.valter.credito.core.dto.dict.LimiteEnum;

public interface Limite {
	public abstract void proximo(Limite proximaRegra);
	public abstract LimiteEnum processar(BigDecimal limite);
}
