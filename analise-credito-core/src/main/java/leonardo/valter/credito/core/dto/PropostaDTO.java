package leonardo.valter.credito.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import leonardo.valter.credito.core.dto.dict.EstadoCivilEnum;
import leonardo.valter.credito.core.dto.dict.LimiteEnum;
import leonardo.valter.credito.core.dto.dict.SexoEnum;
import leonardo.valter.credito.core.dto.dict.StatusPropostaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropostaDTO implements Serializable {
	
	private static final long serialVersionUID = 7777617286038911816L;
	private Integer id;
	private Integer idade;
	private SexoEnum sexo;
	private EstadoCivilEnum estadoCivil;
	private Integer dependentes;
	private BigDecimal renda;
	private StatusPropostaEnum status;
	private LimiteEnum limite;
}