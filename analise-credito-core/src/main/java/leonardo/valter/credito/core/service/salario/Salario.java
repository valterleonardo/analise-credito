package leonardo.valter.credito.core.service.salario;

import java.math.BigDecimal;

public interface Salario {

	public abstract void proximo(Salario proximaRegra);
	public abstract int processar(BigDecimal salario);
}
