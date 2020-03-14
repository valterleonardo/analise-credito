package leonardo.valter.credito.core.service.estadocivil;

import org.springframework.stereotype.Service;

@Service
public class EstadoCivilService {
	
	public static EstadoCivil iniciarRegraEstadoCivil() {
		return new EstadoCivilPrimeiraRegra();
	}
}