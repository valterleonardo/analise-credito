package leonardo.valter.credito.core.service.sexo;

import leonardo.valter.credito.core.dto.dict.EstadoCivilEnum;
import leonardo.valter.credito.core.dto.dict.SexoEnum;

public interface Sexo {
	public abstract void proximo(Sexo proximaRegra);
	public abstract int processar(SexoEnum sexo, EstadoCivilEnum estadoCivil, int pontuacao);
}
