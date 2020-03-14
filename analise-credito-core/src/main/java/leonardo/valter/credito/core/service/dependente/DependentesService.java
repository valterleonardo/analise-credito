package leonardo.valter.credito.core.service.dependente;

import org.springframework.stereotype.Service;

@Service
public class DependentesService {

	public static Dependente iniciarRegraDependente() {
		Dependente dependentePrimeiraRegra = new DependentePrimeiraRegra();
		Dependente dependenteSegundaRegra = new DependenteSegundaRegra();
		dependentePrimeiraRegra.proximo(dependenteSegundaRegra);
		
		return dependentePrimeiraRegra;
	}
}
