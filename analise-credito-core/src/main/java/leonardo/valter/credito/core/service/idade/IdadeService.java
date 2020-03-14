package leonardo.valter.credito.core.service.idade;

import org.springframework.stereotype.Service;

@Service
public class IdadeService {
	
	public static Idade iniciarRegraIdade() {
		Idade idadePrimeiraRegra = new IdadePrimeiraRegra();
		Idade idadeSegundaRegra = new IdadeSegundaRegra();
		idadePrimeiraRegra.proximo(idadeSegundaRegra);
		
		return idadePrimeiraRegra;
	}
}