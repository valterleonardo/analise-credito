package leonardo.valter.credito.core.service.sexo;

import leonardo.valter.credito.core.dto.dict.EstadoCivilEnum;
import leonardo.valter.credito.core.dto.dict.SexoEnum;

public class SexoTerceiraRegra implements Sexo {

	private Sexo proximaRegraSexo;
	
	public void proximo(Sexo regra) {
    	proximaRegraSexo = regra; 
    } 

	public int processar(SexoEnum sexo, EstadoCivilEnum estadoCivil, int pontuacao) {
    	if (SexoEnum.MASCULINO.equals(sexo) 
    			&& (EstadoCivilEnum.CASADO.equals(estadoCivil) || EstadoCivilEnum.DIVORCIADO.equals(estadoCivil)))
    		return pontuacao += 3;
    	else
    		return 0;
    } 
}