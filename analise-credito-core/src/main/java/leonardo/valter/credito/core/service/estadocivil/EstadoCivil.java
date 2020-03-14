package leonardo.valter.credito.core.service.estadocivil;

import leonardo.valter.credito.core.dto.dict.EstadoCivilEnum;

public interface EstadoCivil {

	public abstract void proximo(EstadoCivil proximaRegra);
	public abstract int processar(EstadoCivilEnum estadoCivil);
}
