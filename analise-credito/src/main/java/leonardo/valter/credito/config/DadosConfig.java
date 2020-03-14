package leonardo.valter.credito.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import leonardo.valter.credito.entity.Proposta;
import leonardo.valter.credito.entity.dict.EstadoCivilEnum;
import leonardo.valter.credito.entity.dict.SexoEnum;
import leonardo.valter.credito.entity.repository.proposta.PropostaRepository;

@Configuration
public class DadosConfig {
	
	@Autowired PropostaRepository propostaRepository;
	
	@Bean
    public void iniciarBancoDeDados() {
		
		Proposta proposta = new Proposta();
		proposta.setNome("Lucas");
		proposta.setIdade(28);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		proposta.setEstado("SC");
		proposta.setDependentes(0);
		proposta.setRenda(new BigDecimal(2500));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Ana");
		proposta.setIdade(17);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		proposta.setEstado("SP");
		proposta.setDependentes(0);
		proposta.setRenda(new BigDecimal(1000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Pedro");
		proposta.setIdade(68);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.CASADO);
		proposta.setEstado("SC");
		proposta.setDependentes(3);
		proposta.setRenda(new BigDecimal(8000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Paula");
		proposta.setIdade(61);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.CASADO);
		proposta.setEstado("RJ");
		proposta.setDependentes(3);
		proposta.setRenda(new BigDecimal(5000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("João");
		proposta.setIdade(56);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
		proposta.setEstado("RJ");
		proposta.setDependentes(2);
		proposta.setRenda(new BigDecimal(2000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Maria");
		proposta.setIdade(45);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
		proposta.setEstado("SP");
		proposta.setDependentes(1);
		proposta.setRenda(new BigDecimal(2000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("José");
		proposta.setIdade(30);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.CASADO);
		proposta.setEstado("MA");
		proposta.setDependentes(2);
		proposta.setRenda(new BigDecimal(8000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Dinae");
		proposta.setIdade(33);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.CASADO);
		proposta.setEstado("SP");
		proposta.setDependentes(1);
		proposta.setRenda(new BigDecimal(10000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Marcos");
		proposta.setIdade(19);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		proposta.setEstado("SC");
		proposta.setDependentes(1);
		proposta.setRenda(new BigDecimal(400));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Suzan");
		proposta.setIdade(63);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.VIUVO);
		proposta.setEstado("MA");
		proposta.setDependentes(3);
		proposta.setRenda(new BigDecimal(1500));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Luci");
		proposta.setIdade(28);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		proposta.setEstado("SC");
		proposta.setDependentes(2);
		proposta.setRenda(new BigDecimal(2500));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Roberto");
		proposta.setIdade(16);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		proposta.setEstado("SP");
		proposta.setDependentes(0);
		proposta.setRenda(new BigDecimal(500));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Bruno");
		proposta.setIdade(30);
		proposta.setSexo(SexoEnum.MASCULINO);
		proposta.setEstadoCivil(EstadoCivilEnum.CASADO);
		proposta.setEstado("MA");
		proposta.setDependentes(5);
		proposta.setRenda(new BigDecimal(8000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
		
		proposta = new Proposta();
		proposta.setNome("Ariel");
		proposta.setIdade(33);
		proposta.setSexo(SexoEnum.FEMININO);
		proposta.setEstadoCivil(EstadoCivilEnum.VIUVO);
		proposta.setEstado("SP");
		proposta.setDependentes(0);
		proposta.setRenda(new BigDecimal(10000));
		proposta.setCpf("000.000.000-01");
		propostaRepository.save(proposta);
    }
}