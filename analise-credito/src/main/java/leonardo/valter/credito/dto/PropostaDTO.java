package leonardo.valter.credito.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import leonardo.valter.credito.entity.dict.EstadoCivilEnum;
import leonardo.valter.credito.entity.dict.LimiteEnum;
import leonardo.valter.credito.entity.dict.SexoEnum;
import leonardo.valter.credito.entity.dict.StatusPropostaEnum;
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
	
	private static final long serialVersionUID = -2507054532396931975L;
	private Integer id;
	private Integer idade;
	private SexoEnum sexo;
	private EstadoCivilEnum estadoCivil;
	private Integer dependentes;
	private BigDecimal renda;
	@Enumerated(EnumType.STRING)
	private StatusPropostaEnum status;
	@Enumerated(EnumType.STRING)
	private LimiteEnum limite;
}
