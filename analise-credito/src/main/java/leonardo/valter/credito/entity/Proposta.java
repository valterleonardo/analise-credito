package leonardo.valter.credito.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import leonardo.valter.credito.entity.dict.EstadoCivilEnum;
import leonardo.valter.credito.entity.dict.LimiteEnum;
import leonardo.valter.credito.entity.dict.SexoEnum;
import leonardo.valter.credito.entity.dict.StatusPropostaEnum;
import lombok.Data;

@Entity
@Data
@Table(name = "PROPOSTA")
@SequenceGenerator(name = "seq_proposta", sequenceName = "seq_proposta_id", allocationSize = 1)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Proposta implements Serializable {
	
	private static final long serialVersionUID = -677780843988616299L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_proposta")
	private Integer id;
	private Integer idade;
	private Integer dependentes;
	
	private String nome;
	private String cpf;
	private String estado;
		
	private BigDecimal renda;
	
	@Enumerated(EnumType.STRING)
	private SexoEnum sexo;
	
	@Enumerated(EnumType.STRING)
	private EstadoCivilEnum estadoCivil;
	
	@Enumerated(EnumType.STRING)
	private StatusPropostaEnum status;
	
	@Enumerated(EnumType.STRING)
	private LimiteEnum limite;
}
