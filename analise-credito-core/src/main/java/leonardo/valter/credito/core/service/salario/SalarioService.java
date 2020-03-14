package leonardo.valter.credito.core.service.salario;

import org.springframework.stereotype.Service;

@Service
public class SalarioService {

	public static Salario iniciarRegraSalario() {		
		return new SalarioPrimeiraRegra();
	}
}
